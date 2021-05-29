## Connection-to-database-via-JDBC-for-Creation-Insertion-and-Retrieval
This is a basic java program to perform the following operations
1. Create a table
2. Insert Records into the table.
3. Retrieve data from the database

### SETUP

1. Download JDBC Driver for MySQL using the link given below <br/>
https://dev.mysql.com/downloads/connector/j/ <br/>
select platform independent from the dropdown menu and download the tar file.
2. Open XAMPP Control Panel and Turn on Apache and MySQL modules.
3. Create a database in phpmyadmin.
4. Create a new project in netbeans.
5. Expand the projects folder and right click on libraries and select add JAR/Folder
6. Select mysql-connector-java-8.0.12.jar and click open.
7. Now, Open Windows > services.
8. On the left window. Right click on databases and click on new connection.
9. When the dialog box opens Click Add and select the mysql-connector-java-8.0.25.jar file . and select MySQL (Connector/J driver) from Driver drop-down and Click Next.
10. In the Customize Connection window, replace the Database name with the name we want to give to the db.
11. Click Test Connection.
12. Store the Photos in a folder in your system. Change the location in the code as required. and create an empty folder to retrieve the student photo from database and change the location in the code as required.
13. Replace the user, password and database name in the code according to phpMyadmin credentials. The default user -'root' and password - '' is used in this java code.
14. Now, you may build and run the program.


