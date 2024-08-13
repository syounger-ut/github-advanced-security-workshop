# Investigating Copilot Pull Request Summaries (GitHub Copilot Enterprise)
GitHub Copilot can help you to explain the code changes in the pull request summaries. It can provide a summary of the code changes, including the security fixes and improvements made to the code.

When reviewing the pull request summaries, you can use GitHub Copilot to explain the code changes and provide additional context to the reviewers. This helps to ensure that the code changes are well-documented and understood by the reviewers.

1. Save your changes, commit your code and push the changes to the branch that you have been working in: `git push origin feature/secret-scanning`

2. Navigate to the GitHub UI and verify that your changes were pushed to your branch

3. On github.com, create a pull request from your branch to the main branch

4. Upon creating the pull request, Copilot will generate a two part summary:
  - A paragraph giving an overview of the changes in the pull request
  - A bulleted list of key changes (with links to the respective lines of code where those changes occur)

5. Review the summary and make any necessary changes to the pull request description

6. Merge the pull request to the main branch

**Note:** This feature is available in GitHub Copilot Enterprise

**From GitHub Documentation:** _"The goal of Copilot pull request summaries is to help optimize an author's ability to quickly provide context when they request a human review that requires sharing context of the changes that were made. It may help increase developer productivity by reducing the time taken to open a pull request."_