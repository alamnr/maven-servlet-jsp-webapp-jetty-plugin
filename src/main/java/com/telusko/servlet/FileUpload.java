package com.telusko.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileExistsException;

@WebServlet("/login/upload")
public class FileUpload extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		 try {
			List<FileItem> multiFiles = sf.parseRequest(request);
			for (FileItem fileItem : multiFiles) {
				fileItem.write(new File("./target/upload/"+fileItem.getName()));
			}
			
			request.setAttribute("success", "File upload successful");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
			
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileExistsException e) {
				request.setAttribute("fileExist", "File already exist");
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}
