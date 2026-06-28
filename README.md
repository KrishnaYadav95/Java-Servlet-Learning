# JSP & Servlet Implementation

A Java web application built to practice and implement core Servlet and JSP concepts, developed by following the **Servlets and JSP** section of the [Complete Java Development: Spring Boot, Microservices, Spring AI](https://www.youtube.com/watch?v=q6z_UCBM5Ek) course by **Telusko (Navin Reddy)**.

---

## 🛠️ Tech Stack

- Java
- Jakarta Servlets (Jakarta EE)
- JSP (JavaServer Pages)
- Apache Tomcat
- Maven
- HTML/CSS

---

## 📚 Concepts Covered

- Servlet lifecycle (`init`, `service`, `destroy`)
- `doGet` and `doPost` methods
- `HttpServletRequest` and `HttpServletResponse`
- `RequestDispatcher` — `forward()` and `include()`
- `sendRedirect()`
- Session Management using `HttpSession`
- Servlet annotations (`@WebServlet`)
- `web.xml` configuration
- JSP basics and integration with Servlets
- Passing data between Servlets and JSPs

---

## 📁 Project Structure

```
src/
└── main/
    ├── java/
    │   └── com.krishna/
    │       ├── FirstServlet.java
    │       ├── SecondServlet.java
    │       ├── RegisterServletApp.java
    │       ├── ServletApp.java
    │       └── ServletLife.java
    └── webapp/
        ├── WEB-INF/
        │   └── web.xml
        ├── index.html
        ├── index.jsp
        ├── registerSuccess.html
        └── success.jsp
```

---

## 🚀 How to Run

1. Clone the repository
2. Open the project in **IntelliJ IDEA**
3. Configure **Apache Tomcat** as the run server
4. Build the project using Maven
5. Deploy and run on Tomcat
6. Access at:
   ```
   http://localhost:8086/MyWebApp1/index.html
   ```

---

## 📖 Reference

- 📺 Course: [Complete Java Development by Telusko](https://www.youtube.com/watch?v=q6z_UCBM5Ek)
- ⏱️ Servlets & JSP section starts at: `28:39:36`
- 👨‍💻 Instructor: Navin Reddy (Telusko)
