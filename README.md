# JenkinsLab

Author: Vijay and Gaetan

1. **Install Jenkins**: First, you need to install Jenkins on your server. You can download Jenkins from its official website and follow the installation instructions provided.

2. **Install Required Plugins**: Once Jenkins is installed, you'll need to install the necessary plugins. For GitHub integration, you'll need the GitHub plugin. You can install plugins from the Jenkins dashboard by navigating to "Manage Jenkins" -> "Manage Plugins" -> "Available" tab, and then search for and install the GitHub plugin.

3. **Set Up GitHub Webhook**: In your GitHub repository settings, set up a webhook to notify Jenkins of any changes pushed to the repository. The webhook should point to your Jenkins server's URL with the `/github-webhook/` endpoint.

4. **Create Jenkins Job**: Now, create a new Jenkins job for your project:
   - Click on "New Item" on the Jenkins dashboard.
   - Enter a name for your job and select "Freestyle project" or "Pipeline" depending on your preference.
   - Configure the job settings as needed, including linking it to your GitHub repository.

5. **Configure Source Code Management (SCM)**: In the Jenkins job configuration, under the "Source Code Management" section, select "Git" and provide the repository URL.

6. **Set Up Build Triggers**: In the job configuration, under the "Build Triggers" section, select "GitHub hook trigger for GITScm polling" to trigger builds automatically whenever changes are pushed to the repository.

7. **Define Build Steps**: Depending on your project, define the build steps in the job configuration. This may include compiling code, running tests, and other necessary tasks.

8. **Configure Post-Build Actions**: After the build steps, you can configure post-build actions such as archiving artifacts, sending notifications, or deploying the build.

9. **Save and Run the Job**: Save the job configuration and manually run the job to verify that everything is set up correctly.

10. **Monitor Build Status**: Once the job is set up and running, monitor the build status on the Jenkins dashboard. You should see builds triggered automatically whenever changes are pushed to the GitHub repository.

With this setup, Jenkins will automatically build your project whenever changes are pushed to the GitHub repository, providing continuous integration for your project. You can further customize the pipeline to include additional stages such as code quality checks, integration tests, and deployment steps as needed.
