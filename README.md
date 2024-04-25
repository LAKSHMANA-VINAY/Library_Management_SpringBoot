Install Eclipse IDE: Before getting started, ensure you have Eclipse IDE installed on your system. You can download it from the official website and follow the installation instructions relevant to your operating system.

Download the Project from GitHub: Head over to the GitHub repository and download the project files.

Install MySQL: Ensure that MySQL is installed on your system. You can download MySQL from the official website and follow the installation instructions relevant to your operating system.

Import the Project: In Eclipse, go to File -> Import. From the dialog that appears, choose General -> Existing Projects into Workspace. Click 'Next' and then browse to the directory where you downloaded the project from GitHub. Select the project folder and click 'Finish' to import it into Eclipse.

Build the Project: Once the project is imported, build it to ensure that all dependencies are resolved and the code compiles without errors. You can do this by right-clicking on the project in the Project Explorer, then selecting 'Build Project'.

Run the Application: After the build is successful, you can run the application from within Eclipse. Locate the main application file or class, right-click on it, and choose 'Run As' -> 'Java Application'. Follow any on-screen prompts or configurations required by the application.

Test Using Postman: To test the application's functionality, you can utilize Postman, a popular API testing tool. Launch Postman and set up the necessary endpoints and requests according to the API documentation provided with the project.

Verify Results: Once you've sent requests via Postman, verify that the application behaves as expected. Check the responses for correctness and ensure that all features and endpoints function properly.

DataBase Schema's: https://drive.google.com/drive/folders/15MD786SdiTuHJFP-wECcwn8ysHazKrLh?usp=sharing

EndPoints:

1) Insert Book

POST http://localhost:8080/insertbook

2) Get Single Book Record

GET http://localhost:8080/getbook/{bookid}

3) Get All Books

GET http://localhost:8080/getbooks

4) Get All Available Books

GET http://localhost:8080/available

5) Update Book Details

PUT http://localhost:8080/modifybook

6) Delete Book

DELETE http://localhost:8080/deleteBook/{bookid}

7) Insert Author

POST http://localhost:8080/insertauthor

8) Get Specific Author Details

GET http://localhost:8080/getauthor/{authorid}

9) Update Author

PUT http://localhost:8080/modifyauthor

10) Delete Author

DELETE http://localhost:8080deleteauthor/{authorid}

11) Take The Book

POST http://localhost:8080/book

12) Return the Book/Change the status of book

PUT http://localhost:8080//changestatus/{rentid}

