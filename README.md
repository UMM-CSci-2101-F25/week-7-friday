# Starter code

In class, we discussed test-driven development. I demonstrated how to create a new class, write tests for the class, and write code in the class to make the test pass. This was mostly to show some of the common workflows we are using in the class and offer up a review of how to do some work in Java.

This project is managed using Maven, so it has a `pom.xml` file to describe dependencies and the structure of the project (e.g., where to find the source code to compile or test code to run tests).

* You can check the coverage of your tests using the following command from the top level of the project in the terminal (requires that Maven is installed, which it is on the lab computers): `mvn clean jacoco:prepare-agent install jacoco:report`.
* You can run your main method using `mvn exec:java` since this `pom.xml` includes instructions for the project about where to find a main method to execute.
* You can compile your code using `mvn compile`
* You can run your tests using `mvn test`. Messages that would show in the debug console if you clicked the triangles will show in the terminal in this case.

In general, it's a good idea to *commit your changes after each task*, [giving appropriate credit to all co-authors](https://docs.github.com/en/github/committing-changes-to-your-project/creating-and-editing-commits/creating-a-commit-with-multiple-authors#creating-co-authored-commits-on-github) involved with the work and describing what was done. Frequently stage changes that belong together, commit the changes (with a [meaningful commit message](https://cbea.ms/git-commit/) that includes co-authorship as described earlier), and push your changes to GitHub.

