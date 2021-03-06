package com.jumpingstone.codequality.fireeye;

import com.jumpingstone.codequality.fireeye.cals.SimilarityCalculatorManager;
import org.apache.commons.cli.*;
import org.neo4j.graphdb.Node;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException, IOException {
        // create Options object
        Options options = new Options();

        // add a option
        Option srcOption   = Option.builder()
         .longOpt("source")
            .argName("src" )
            .hasArg(true)
            .desc("source directory" )
            .build();
        options.addOption(srcOption);

        Option graphicDBDir   = Option.builder()
                .longOpt("database")
                .argName("db" )
                .hasArg()
                .desc("database directory" )
                .build();
        options.addOption(graphicDBDir);


        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse( options, args);

        String sourceDirectory = cmd.getOptionValue("source");
        Path sourceDir = Paths.get(sourceDirectory);
        String graphicDBDirectory = System.getProperty("user.home") + File.separator + ".file_similarity_db";
        if (cmd.hasOption("database")) {
            graphicDBDirectory = cmd.getOptionValue("database");
        }





    }
}
