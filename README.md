# Jenkins-CD-Demo

**Ex. No: 5 - CREATE A CD PIPELINE IN JENKINS**

**Author:** Bharath Kumar ([@SSBHARATHKUMAR-13](https://github.com/SSBHARATHKUMAR-13))  
**Email:** ssbharathkumar03@gmail.com  
**Department:** Computer Science and Engineering  

---

## 🎯 Aim
To create a Jenkins Continuous Delivery (CD) pipeline that automatically checks out, builds, and tests an application, and sends an email notification with the result of each build.

---

## 🚀 Application Details
This repository contains a Java-based application (`StudentService`) that demonstrates:
- Model: `Student` entity (ID, Name, Department, Marks).
- Service: `StudentService` with grade calculation, scholarship qualification, and class average computation.
- Automated Unit Tests: Powered by JUnit 5 (`StudentServiceTest` & `CalculatorTest`).
- Build Automation: Apache Maven with automated surefire testing.

---

## 🔄 Jenkins Pipeline Workflow
The Declarative Pipeline executes the following automated stages:
1. **Checkout**: Automatically pulls source code from GitHub (`https://github.com/SSBHARATHKUMAR-13/Jenkins-CD-Demo.git`).
2. **Build**: Compiles source files and prepares application artifacts.
3. **Test**: Executes automated JUnit 5 test suites.
4. **Post Actions (Notifications)**:
   - On **Success**: Sends a build success notification via SMTP to `ssbharathkumar03@gmail.com`.
   - On **Failure**: Sends a build failure alert with direct console log links.

---

## ⚙️ Setup & Execution
1. **Start Jenkins Server:**
   ```bash
   sudo systemctl start jenkins
   ```
2. **Start MailHog SMTP Test Server:**
   ```bash
   sudo docker run -d -p 1025:1025 -p 8025:8025 mailhog/mailhog
   ```
3. **Configure Mail Server in Jenkins:**
   - Manage Jenkins → System → E-mail Notification
   - SMTP Server: `localhost` | Port: `1025`
   - Disable SMTP Authentication and SSL.
4. **Run Pipeline Job:**
   - Create Pipeline job `EmailNotification`.
   - Paste the `Jenkinsfile` pipeline script and trigger **Build Now**.
   - Check build status in Jenkins and view email notification at `http://localhost:8025`.
