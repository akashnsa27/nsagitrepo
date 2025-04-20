# nsaitpoint-GitAndGithub-workshop

**🔥GIT & GITHUB🔥**
🎥Class Recording 
Session 01 🎥: https://youtu.be/gce4Ubhe2Rg
Session 02 🎥: https://youtu.be/nspgZof_P4s

=====================================
Source Code Repository Tools[GITHUB] 
Version Control Softwares[GIT]
================================

-> Multiple developers will work for project development

-> Developers will be working from multiple locations

-> All developers code should be stored at one place (Code Integration Should Happen)

-> To integrate all the developers source code at one place we will use Source Code Repository Softwares


============================================
Advantages with Source code repository sofwares
============================================

1) All the developers can connect to repository server and can integrate the code

2) Code Integration will become easy

3) Repository server will provide monitored access

				- Who
			        - When
				- Why
				- What


==============
Repository Tools
==============

SVN (outdated)

Git Hub

BitBucket


=================================
Environment Setup to work with Git Hub
=================================

1) Create Github account ( www.github.com )

2) Download and install Git Client software ( https://git-scm.com/downloads )

3) Once installation completed, right click on the mouse and verify git options display (If git options displaying our git client installation completed successfully)


=====================
Working with GitHub
=====================

-> Login into github account with your credentials

-> Create Repository in github

Note: Repository is used to store project source code. Every Project will have one repository

-> When we create a repository, unique URL will be generated with Repository Name (i.e Repo URL)
  e.g. : https://github.com/akashnsa27/nsagitrepo.git

-> All the developers will connect to repository using Repository URL
-> We can create 2 types of Repositories in Git Hub
	
			1) public repository 

			2) private repository

-> Public Repository means everybody can access but we can choose who can modify our repository
-> Private Repository means we will choose who can access and who can modify
		e.g : https://github.com/akashnsa27/nsagitrepo.git

Steps to Push Local Project to GitHub (Without README)
1️)_Create a Repository on GitHub
Go to GitHub and create a new repository.

Do NOT add a README file during creation.

Copy the repository URL.
Example:
https://github.com/akashnsa27/nsagitrepo.git

2️)Create a Project Locally
Create your project folder and add your code/files inside it.

3️)Open Git Bash from Project Directory
Navigate to your project directory.

Right-click inside the folder → Click "Git Bash Here"

4)Initialize the Local Repository
$ git init
This sets up a new Git repository in your project directory.

5)Add the Remote Origin (GitHub URL)
$ git remote add origin https://github.com/akashnsa27/nsagitrepo.git

6)Add All Files to the Staging Area
$ git add .
This stages all your project files for commit.

7)Commit Your Changes
$ git commit -m "write meaningful msg"
Replace "write meaningful msg" with a meaningful description of your changes.

8)Push Code to GitHub
$ git push -u origin main

Important Note: Branch Name Check
Your local branch name must match the GitHub branch name (usually main by default on GitHub).

To check your local branch:

$ git branch
If needed, rename your local branch to match GitHub's:

$ git branch -m <old_branch_name> <new_branch_name>

============================================================
Steps to Join and Contribute to an Existing GitHub Project
============================================================

1)Create a Folder to Clone the Project

2)Clone the Repository from GitHub
Use the git clone command with the repository URL:

$ git clone https://github.com/username/repo-name.git
Replace the URL with the actual repo link.
This creates a local copy of the project inside a folder named repo-name.

3)Create and Checkout to a New Branch
Never work directly on the main branch! Always create your own feature or bugfix branch:

$ git checkout -b feature/your-branch-name
Example:

$ git checkout -b feature/add-login-page
This creates and switches to a new branch based on the current main branch.

4)Add Your Features or Fixes
Open the project in your code editor (Intellij).

Make the necessary code changes or add new files.

Test your changes locally to ensure they work correctly.

5)Stage and Commit Your Changes
First, check the status of changed files:

$ git status
Add all changes to the staging area:

$ git add .
Commit with a meaningful message:

$ git commit -m "Added login page with basic validation"

6)Push Your Branch to GitHub
$ git push origin feature/your-branch-name
If it's the first time pushing this branch, use:

$ git push -u origin feature/your-branch-name

7)Raise a Pull Request (PR)
Once your changes are pushed:

Go to the GitHub repo in your browser.

You’ll see a message to create a Pull Request for your newly pushed branch.

Click "Compare & pull request".

Add a title and description explaining what you did.

Select the base branch (usually main) and compare branch (your feature branch).

Click "Create Pull Request".

8)Wait for Review and Merge
Once your PR is reviewed and approved, either you or the reviewer can merge it into the main branch.

After merging, pull the latest main branch into your local main:

$ git checkout main
$ git pull origin main


