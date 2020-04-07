package com.bridgelabz.dummyProject;

public @interface MethodInfo {
    String comments()default "main method";

    String author()default "ranganath";

    String date()default "April 7 2020";

    int revision()default 1;
}
