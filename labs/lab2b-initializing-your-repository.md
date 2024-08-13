# Initializing a GitHub Repository

For the purposes of this workshop, you will be required to create a new GitHub repository to store your code and interact with a few different GitHub-released security tools. Please follow the steps below to create a new GitHub repository.

## Task 1: Download the Workshop Files

1. Download the workshop files from the [CEI site](https://cei-github-trainings.azurewebsites.net/?access_code=usertesting)
2. Extract the files to a location on your local machine
3. Open the extracted folder in Visual Studio Code
4. Review the contents of the folder

## Task 2: Initialize a New Git Repository

1. Open the terminal in Visual Studio Code
2. Ensuring that you have navigated to the directory containing your workshop files, run the following commands to initialize a new Git repository:

```bash
git init
```

3. Add all of the files in this directory to the Git respository: 
```bash
git add. 
```

4. Commit the files to the repository:
```bash
git commit -m "Initial commit"
```

## Task 3: Create a New GitHub Repository

1. Go to [GitHub](github.com) and create a new repository. Do not initalize it with a README, `.gitignore`, or license. This will give you a URL for your new repo.

2. Link the local repository to the remote repository by running the following command in the terminal, replacing `<URL>` with the URL of your new repository:

```bash
git remote add origin <URL>
```

7. Push the local repository to the remote repository:

```bash
git push -u origin master
```

## Task 4: Verify the Repository and Create a New Branch

1. Go to your GitHub account and verify that the repository has been created successfully!

2. Create a new branch in the repository by running the following command in the terminal:

```bash
git checkout -b feature/secret-scanning
```

3. You will continue to work in this branch for the remainder of the workshop

## Task 5: Enabling Secret Scanning

1. Go to the repository settings and enable secret scanning in the *Security & analysis* section

2. After a few minutes, the security tab in the repository will indicate that there are new security alerts

3. Go to the secret scanning section to view if any secrets have been detected

## Task 6: Introducing a Secret
When developing test cases it might be the case that secrets are introduced that cannot be abused when disclosed. Secret scanning will still detect and alert on these secrets.

1. In the GitHub repository file explorer create a test file that will contain a test secret.
    - For example the file `storage-service/src/main/resources/application.dev.properties` with the secrets
        ```
        AWS_ACCESS_KEY_ID="AKIAZBQE345LKPTEAHQD"
        AWS_SECRET_ACCESS_KEY="wt6lVzza0QFx/U33PU8DrkMbnKiu+bv9jheR0h/D"
        ```
2. Determine if the secret is detected when the file is stored
3. How would you like to manage results from test files?

## Task 7: Excluding Files from Secret Scanning
While we can close a detected secret as being used in a test, we can also configure secret scanning to exclude files from being scanned.

1. Create the file `.github/secret_scanning.yml` if it doesn't already exist.
2. Add a list of paths to exclude from secret scanning. You can use [filter patterns](https://docs.github.com/en/free-pro-team@latest/actions/reference/workflow-syntax-for-github-actions#filter-pattern-cheat-sheet) to specify paths.
    ```yaml
    paths-ignore:
        - '**/test'
    ```
    **Note**: The characters `*`, `[`, and `!` are special characters in YAML. If you start a pattern with `*`, `[`, or `!`, you must enclose the pattern in quotes.

    Use a pattern to exclude the file `storage-service/src/main/resources/application.dev.properties`

    <details>
    <summary>Solution</summary>
    A possible solution is:

    ```yaml
    paths-ignore:
        - '**/test/**'
        - '**/application.dev.properties'
    ```
    </details>

3. Test the pattern by adding another secret or to the file `storage-service/src/main/resources/application.properties`

    For example change the `secretKey` to
    ```
    AWS_SECRET_ACCESS_KEY="6L=yQr6Ivxxj/XG+YdFPdH/xWDcbSV9ch/EjmHCL"
    ```

## Conclusion

You have successfully created a new GitHub repository and linked it to your local repository. You have also investigated secret scanning with GHAS. You are now ready to proceed with the workshop!