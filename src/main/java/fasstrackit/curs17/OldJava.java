package fasstrackit.curs17;

import java.util.Locale;

public class OldJava {
    public static void main(String[] args) {
        System.out.println(processStringStar("inghetata"));
        System.out.println(processingString("inghetata", new WordDecorator() {
            @Override
            public String decorate(String word) {
                return word + " ====";
            }
        }));
    }


    private static String processingString(String word, WordDecorator decorator) {
        return decorator.decorate(word);
    }

   private static String processStringStar(String word) {
        return "*" + word + "*";
    }
}

 interface WordDecorator {
    String decorate(String word);

}

 class ToUpperCaseDecorator implements WordDecorator {

    @Override
    public String decorate(String word) {
        return word.toUpperCase();
    }
}

 class StarDecorator implements WordDecorator {

    @Override
    public String decorate(String word) {
        return "*" + word + "*";
    }
}

