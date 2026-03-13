package com.learn.tool;

public class GenerateAst {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage error: generate_ast <output_directory>");
            System.exit(64);
        }

        String outputDir = args[0];
    }

}
