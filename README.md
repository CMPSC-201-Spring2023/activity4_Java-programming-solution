# Activity 4: Java Programming

## Introduction

This activity requires a programmer to implement and test a Java program,
called `MadLibs`, that will produce textual output that plays a MadLibs game.
First, the program will display the name of the programmer and the date at which
the program was run. Then, it will read in words and numbers from the terminal and
display a fun story.

### progator Docker Image

Follow the instructions below, which can also be found at the `progator` Docker image link provided below, to get started. Additionally, please watch the lab introduction video for a working example of how to access the Docker image for this course and how to mount a directory as a volume.

[progator Docker Image](https://hub.docker.com/repository/docker/janyljumadinova/progator)

#### Pulling Image

Download automated build from public Docker Hub Registry:

`docker pull janyljumadinova/progator`

#### Running

You can mount a directory as a volume with the argument *-v /your-path/:/root/ like this :

`docker run -d -p 80:80 -v /your-path/:/root/environment janyljumadinova/progator`

#### Accessing the IDE

<http://localhost>

### Running the Java locally

If you have Java installed locally, you can also run Java locally from the `src` directory.

### Running Java

To compile a single program type run `javac ProgramName.java`

To compile all programs inside the directory, run `javac *.java`

To run the Java program with the main method, run `java ProgramName`

