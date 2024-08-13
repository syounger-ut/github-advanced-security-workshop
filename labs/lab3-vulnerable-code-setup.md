# Lab 3: Vulnerable Code Setup for Security Findings
This lab is designed to help you set up the vulnerable code for security findings. You will clone the vulnerable code repository, install the necessary dependencies, and verify that everything is working as expected. 

## Java Spring Boot Vulnerable Code
The vulnerable code is a Java Spring Boot application that contains security vulnerabilities. The vulnerable code is available in the following path [completed/vulnerable/springbootemployee-api](completed/vulnerable/springbootemployee-api). 

1. Open the terminal in the path where you have cloned the repository and navigate to the `completed/vulnerable/springbootemployee-api` directory

2. Create a CodeQL database for the Java Project in the terminal: `codeql database create java-db --language=java --source-root=completed/vulnerable/springbootemployee-api`

3. Choose the database from the worksapce: `codeql database analyze java-db java-lgtm.qls --format=sarif-latest --output=results.sarif`

4. View the results in the `results.sarif` file

**NOTE:** You can also use the CodeQL extension in VS Code which provides a rich, interactive experience for browsing CodeQL query results:
  1. Open the CodeQL extension in VS Code
  2. Run the `CodeQL: Choose Database from Workspace` command to select the `java-db` database that you created in the previous step
  3. Run the `CodeQL: Run Query` command and select the `java-lgtm.qls` query suite to analyze the code. The results will be displayed in the CodeQL Results view.

5. The vulnerabilities in the Java Spring Boot application are as follows: 
  - **SQL Injection:** The code is vulnerable to SQL Injection attacks due to the use of unsanitized user input in SQL queries
  - **Use of Hardcoded Credentials:** The code contains hardcoded credentials that can be exploited by attackers
  - **Spring Cross-Site Request Forgery (CSRF):** The code is vulnerable to CSRF attacks due to missing CSRF protection in the Spring Security configuration
  - **Spring Security Misconfiguration:** The code has misconfigured Spring Security settings that can lead to security vulnerabilities

**NOTE:** The vulnerable code is available in the `completed/vulnerable/springbootemployee-api` directory. You can use the vulnerable code to test the security findings and remediations with CodeQL and Dependabot in the next lab.

## Javascript React Application Vulnerable Code
The vulnerable code is a Javascript / React application that contains security vulnerabilities. The vulnerable code is available in the following path [completed/vulnerable/frontend](completed/vulnerable/frontend). This code contains both nodejs and reactjs vulnerabilities. It also contains both open source vulnerabilities and code vulnerabilities.

1. Open the terminal in the path where you have cloned the repository and navigate to the `completed/vulnerable/frontend` directory
  
```bash
  cd completed/vulnerable/frontend
```

2. Run the CodeQL analysis command to create a CodeQL database for a Java Project

```bash
  codeql database create frontend-db --language=java
```

3. Choose the database from the worksapce: `codeql database analyze frontend-db java-lgtm.qls --format=sarif-latest --output=results.sarif`

4. View the results in the `results.sarif` file

5. Practice taking note of the vulnerabilities found in the code, add them here:

**The vulnerabilities in the Java Spring Boot application are as follows:**
    - 

## Enabling Code Scanning in Your Repository
Enabling code scanning in your repo allows you to find and fix security vulnerabilities in your code. You can use CodeQL to scan your code and identify security vulnerabilities in your codebase.

1. Go to the `Code scanning alerts` section in the `Security` tab

2. Start the `Set up this workflow` step in the `CodeQL Analysis` card

3. Review the created Action workflow and accept the default proposed workflow

4. Head over to the `Actions` tab to see the created workflow in action

5. Review and manage your results:
  - Go to the `Code scanning results` in the `Security` tab.
  - For a result, determine:
      - The issue reported
      - The corresponding query id
      - Its `Common Weakness Enumeration` identifier
      - The recommendation to solve the issue
      - The path from the `source` to the `sink`. Where would you apply a fix?
      - Is it a *true positive* or *false positive*?

## Next Steps
- Once you have set up the vulnerable code, you are ready to proceed to the next lab. You can start with [Lab 4: Security findings and remediations with CodeQL and Dependabot](lab4-security-findings-remediations.md) to use CodeQL and to identify security findings and remediate the vulnerabilities in the code.
