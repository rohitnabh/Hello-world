/*
How to set up Java so you can compile and run your Java code:

1. Download and install the Java Development Kit (JDK):
   - Go to https://www.oracle.com/java/technologies/downloads/ or search for "OpenJDK download".
   - Download the appropriate installer for your operating system (Windows, macOS, or Linux).
   - Follow the installation instructions for your platform.

2. Set up your environment variables (if not set automatically):
   - On Windows:
     - Open System Properties > Advanced > Environment Variables.
     - Add the path to the JDK's 'bin' directory to the 'Path' variable.
   - On macOS/Linux:
     - Add the following line to your ~/.bash_profile, ~/.bashrc, or ~/.zshrc:
       export PATH=$PATH:/path/to/jdk/bin

3. Verify the installation:
   - Open a terminal or command prompt.
   - Run: java -version
   - Run: javac -version
   - Both commands should print the installed Java version.

4. Write your Java code in a file with a .java extension (e.g., HelloWorld.java).

5. Compile your code:
   javac HelloWorld.java

6. Run your code:
   java HelloWorld
*/

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
