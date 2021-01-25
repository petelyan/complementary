# complementary
An application that produces K-complementary pairs for a number K given an array of integers.

Requirements:
JDK 1.8 minimum
Maven build tool


Instructions for execution in Windows:
Application run in command line. 
Navigate to root directory and package the application (run - "mvn package")
When complete navigate to the target directory (cd target)
Run application with the java tool: java -jar complementary-1.0.0.jar

NOTE: The results give pairs the same way we would think of cartesian products: K = 5, arr = {1,4} will produce (1,4) and (4,1) as pairs.
