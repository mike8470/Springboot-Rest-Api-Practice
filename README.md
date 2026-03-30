# ⚙️ Springboot-Rest-Api-Practice - Build Simple REST APIs Easily

[![Download](https://img.shields.io/badge/Download-Springboot%20Rest%20Api%20Practice-brightgreen)](https://github.com/mike8470/Springboot-Rest-Api-Practice)

---

## 📋 About this Application

Springboot-Rest-Api-Practice is a tool to help you work with REST APIs. It shows how to create simple web services for managing data, with features like creating, reading, updating, and deleting information. The app also includes options to limit results with pages, search through data, and connect to a database using Java Persistence API (JPA). This guide helps you download and run the app on a Windows computer, even if you have no programming experience.

---

## 💻 System Requirements

Before you start, check that your computer meets these requirements:

- Windows 10 or later
- At least 4 GB of RAM (8 GB is better)
- At least 500 MB free disk space
- Java Runtime Environment (JRE) 11 or higher installed  
  You can download Java [here](https://www.java.com/en/download/).

---

## ⬇️ Download Springboot-Rest-Api-Practice

To get the application, visit the page below and download the files you need.

[![Download Link](https://img.shields.io/badge/Download-GitHub-blue)](https://github.com/mike8470/Springboot-Rest-Api-Practice)

Click the button above. On the GitHub page, look for a green "Code" button and then choose "Download ZIP" to save the application files to your computer.

---

## 🛠️ Installing and Running the Application on Windows

Follow these steps carefully to install and run Springboot-Rest-Api-Practice.

### Step 1: Download the Application Files

1. Click the green **Code** button near the top right of the page.
2. Select **Download ZIP**.
3. Choose where to save the ZIP file on your computer (like your Desktop or Downloads folder).

### Step 2: Unpack the Downloaded ZIP

1. Go to the folder where you saved the ZIP file.
2. Right-click the ZIP file, then choose **Extract All**.
3. Select a place where you want the unpacked files. Note this location as you will need it later.
4. Click **Extract** and wait until it finishes.

### Step 3: Check for Java Installation

Springboot-Rest-Api-Practice needs Java to run.

1. Press the **Windows** key.
2. Type "cmd" and press **Enter** to open the command prompt.
3. Type `java -version` and press **Enter**.
4. If it shows a version number 11 or higher, you are ready to continue.
5. If it says Java is not recognized, go to [Java Download](https://www.java.com/en/download/) and install the latest version, then repeat this step.

### Step 4: Run the Application

1. Open the folder where the app files are extracted.
2. Look for a file named **Springboot-Rest-Api-Practice.jar** or similar file ending with `.jar`.
3. Hold down the **Shift** key, then right-click anywhere inside this folder.
4. Select **Open PowerShell window here** or **Open command window here**.
5. In the command window, type this command and press **Enter**:

   ```
   java -jar Springboot-Rest-Api-Practice.jar
   ```

6. The application will start and show some text lines. Do not close this window while the app runs.

---

## 📦 What the Application Does

Springboot-Rest-Api-Practice helps you manage data easily through a web service. Here are its main features:

- Create, read, update, and delete records in a database (CRUD operations)
- Limit the number of results shown on one page (pagination)
- Search for specific data using keywords
- Connect to a MySQL database to store and manage information
- Use Java Persistence API (JPA) for easy data handling

---

## 🔍 How to Use the Application

You usually interact with the application through a tool called Postman or a web browser. These let you send requests to the application and get responses.

### Basic Example Requests

- **Get all records:**  
  Send a `GET` request to:  
  `http://localhost:8080/api/items`

- **Add a new record:**  
  Send a `POST` request with data in JSON format to:  
  `http://localhost:8080/api/items`

- **Update an existing record:**  
  Send a `PUT` request with data to:  
  `http://localhost:8080/api/items/{id}`  
  Replace `{id}` with the actual item number.

- **Delete a record:**  
  Send a `DELETE` request to:  
  `http://localhost:8080/api/items/{id}`

---

## ⚙️ Adjusting Settings

Settings such as the database connection and server port can be changed in the configuration file named `application.properties`. It is located in the `src/main/resources` folder if you explore the app files.

Typical settings include:

- Database URL, user name, and password
- Server port number (default is 8080)
- JPA settings

---

## 🐞 Troubleshooting Tips

If you see errors or problems:

- Make sure Java is installed and the version is correct.
- Check that no other program uses port 8080.
- Confirm you downloaded and unpacked all files correctly.
- Look at the command window for messages about errors when running the app.
- Restart the computer and try again if something does not work.

---

## 📂 Helpful Links and Resources

- Download Java: https://www.java.com/en/download/  
- Spring Boot Documentation: https://spring.io/projects/spring-boot  
- MySQL Download: https://dev.mysql.com/downloads/  
- Postman for API testing: https://www.postman.com/downloads/  

Use these resources if you want to learn more or explore beyond running this app.

---

## ⬇️ Download Springboot-Rest-Api-Practice (Again)

You can always get the latest copy here:

[![Download Link](https://img.shields.io/badge/Download-GitHub-blue)](https://github.com/mike8470/Springboot-Rest-Api-Practice)