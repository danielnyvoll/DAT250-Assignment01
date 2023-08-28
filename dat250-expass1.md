## Reflection on Setting Up the Software Development Environment for Assignment 01

This assigmnet involved for me several technical hurdles and I used several different approaches to the problems. Here is an account of the challenges I encountered and the steps I took to overcome them:

### Installation Challenges and Solutions:
The initial phase of environment setup involved installing essential components like Java, Gradle, and Javalin. However, I encountered issues while trying to configure these tools. One specific challenge was related to incompatible Java versions, leading to errors during the build process. After updating Java to the required version as stated in the documentation, I was able to resolve these compatibility issues.

### Validation of Environment:
Once the installation was complete, I took steps to validate the functionality of the software development environment. I followed the provided guidelines to build and run the application using Gradle. This included executing test cases and confirming that the application was accessible through a web browser. This validation process reassured me that the environment was properly set up.

### Test Case Implementation and Challenges:
Writing test cases for the application was an essential part of the assignment. However, I faced challenges related to importing classes and methods required for testing. Incorrect import statements and missing method definitions resulted in compilation errors. By meticulously reviewing the code and ensuring proper imports, I managed to overcome these challenges and implement effective test cases.

### Refactoring for Testability:
To enhance code maintainability and testability, I refactored the code by modularizing the core unit conversion logic into a dedicated method named convertUnits. This refactoring helped make the codebase more organized and facilitated the implementation of unit tests to verify the correctness of the logic.

### Issues with Podman Machine Start:
During the environment setup, one significant obstacle I encountered was related to the Podman machine. Despite repeated attempts, I was unable to get the Podman machine to start. This issue persisted over time, causing frustration and hindering my progress. Despite my best efforts, the Podman machine never initiated successfully.
### Exploration of Docker without Guidance:
In my pursuit of a functional environment, I also attempted to set up Docker as an alternative to Podman. However, due to the absence of a detailed guide, this endeavor proved to be challenging. The lack of specific instructions hindered my progress and highlighted the importance of comprehensive guidance in navigating unfamiliar technologies.
### Using Brew Install Instead of SDK Install:
While installing some components, I deviated from the recommended installation method by using the brew install command instead of sdk install. This led to slight inconsistencies in the environment setup. I later realized the importance of following the provided instructions precisely to avoid compatibility and version-related issues.

### Pending Challenges and Takeaways:
Despite successfully tackling various challenges, I encountered a roadblock when attempting to run the test cases using Gradle. The tests were not executing as expected, resulting in compilation failures. Despite my best efforts to debug the issue by reviewing Gradle configurations and test class setups, I was unable to find a solution within the given timeframe.

These challenges underscored the importance of meticulous setup, code organization, and thorough testing in software development. While I was able to overcome several obstacles, unresolved issues with test case execution taught me the value of seeking help and collaborating with peers to find solutions.