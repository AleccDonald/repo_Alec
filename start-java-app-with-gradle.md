# What is this for? #

Instructions in this file will help you create a sample Java application
which you can them modify for whatever project you're working on.  The build
tool chosen is Gradle.

### How do I get set up? ###

The screen shots come from a Linux environment (Ubuntu 22.04).

You must have `gradle` installed before you can complete the setup.

#### Summary of set up ####

1. In your bitbucket or github account create a project.

2. Create a repository under the project, we'll call it `<repo_name>`.

3. Edit `.gitignore`

  While still in your bitbucket/github account edit the `.gitignore` file to include the following:
  ```
  # Gradle
  .gradle/
  /build/
  # Avoid ignoring Gradle wrapper jar file (.jar files are usually ignored)
  !gradle-wrapper.jar
  ```

4. On your computer go to the folder where you'll be working on your project.

5. Clone the repository you just created
You can find the specific git command needed for cloning on bitbucket/github, next to the repository, like in this image taken on bitbucket:
![bitbucket](http://thesleepless.com/cs330/clone-button-bitbucket.png)

6. Go to the directory created when you cloned the repo:
```
$ cd <repo_name>
```

7. Create the sample application:
```
$ gradle init
```
Make the selections necessary for your specific project; here they are for a small Java application:
![gradle init selections](http://thesleepless.com/cs330/gradle-init-selections.png)

8. Build the executable:
```
$ ./gradlew build
```

9. Run the executable, you should see `Hello World!` on your terminal:
```
$ ./gradlew run
```
10. Import the sample app into your IDE, e.g. Eclipse, and edit the App.java and AppTest.java files as your needs dictate.

11. Happy coding!

### License ###

[GNU Public License](https://www.gnu.org/licenses/gpl-3.0.html)

### Who do I talk to? ###

Email bistriceanu@iit.edu
