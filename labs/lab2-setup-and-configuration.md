# Lab 2: Setup and Configuration

This lab is designed to help you get your development environment set up and ready to go for the rest of the course. You will install the necessary tools and software, and verify that everything is working as expected. If you have the tools and software already installed, you can skip this lab and proceed to the next lab.

## Prerequisites
- Basic understanding of Git and GitHub
- Basic understanding of JavaScript, React
- GitHub Copilot Extension installed in IDE and authenticated with GitHub account
- Node.js and npm installed on your local machine
- CodeQL and Dependabot set up in your repository

## Node.js and npm

- Install Node.js and npm from [https://nodejs.org/en/download/](https://nodejs.org/en/download/)
- Verify the installation by running the following commands in the terminal:

```bash
  node -v
  npm -v
```

## CodeQL and Dependabot

CodeQL and Dependabot are tools that help you find and fix security vulnerabilities in your code and dependencies. You can use these tools to scan your code and dependencies for security vulnerabilities and get recommendations on how to fix them.

### CodeQL 

- Install CodeQL CLI following these instructions: https://docs.github.com/en/code-security/codeql-cli/getting-started-with-the-codeql-cli/setting-up-the-codeql-cli
- Follow the instructions to set up CodeQL in your repository from https://docs.github.com/en/code-security/secure-coding/setting-up-code-scanning-for-a-repository
- Install the CodeQL extension in Visual Studio Code: 
  - Open Visual Studio Code
  - Go to Extensions
  - Search for CodeQL
  - Click Install
- Install the CodeQL Agent extension in Visual Studio Code: 
  - Open Visual Studio Code
  - Go to Extensions
  - Search for CodeQL Agent
  - Click Install
  **Note: For the purposes of this lab, you should modify the extension settings for the project language to be Java**
    - Open the CodeQL Agent extension
    - Click settings
    - Navigate to the CodeQL Agent: Project Language setting
    - Select Java

### Dependabot

- Enable Dependabot in your repository from https://docs.github.com/en/code-security/supply-chain-security/keeping-your-dependencies-updated-automatically/enabling-and-disabling-version-updates

## Next Steps
Once you have installed the necessary tools and software, you are ready to proceed to the next lab. You can start with [Lab 2b: Initializing your GitHub Repository](lab2b-initializing-your-repository) to set up the vulnerable code for security findings!
