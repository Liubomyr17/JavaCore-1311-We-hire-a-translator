package com.company;

/*

1311 We hire a translator
 
We hire a translator
1. Create an EnglishTranslator class that inherits from Translator.
2. Implement all abstract methods.
3. Think about what the getLanguage method should return.
4. The program should display “I am a translator from English” by calling the translate method on an object of type
EnglishTranslator.

Requirements:
1. The EnglishTranslator class must be declared inside the Solution class.
2. The EnglishTranslator class must inherit from the Translator class.
3. In the EnglishTranslator class, all abstract methods inherited from the Translator class must be implemented.
4. The getLanguage method should return a string that will allow the task condition to be met.
5. The main method should display the string "I am a translator from English" by calling the translate method on an
object of type EnglishTranslator.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {

            return "Я переводчик с " + getLanguage();
        }
    }

    public static class EnglishTranslator extends Translator {
        @Override
        public String getLanguage() {
            return "английского";
        }
    }
}

