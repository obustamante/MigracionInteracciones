package test.translate;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

import java.io.PrintStream;

public class TranslateTest {


    public static void main(String[] args) {

        String text = "Hello";

        try {
            String sourceLang = "en";
            String targetLang = "es";
            TranslateTest.translateTextWithOptions(text, sourceLang, targetLang, System.out);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    /**
     * Translate the source text from source to target language.
     *
     * @param sourceText source text to be translated
     * @param sourceLang source language of the text
     * @param targetLang target language of translated text
     * @param out        print stream
     */
    public static void translateTextWithOptions(
            String sourceText,
            String sourceLang,
            String targetLang,
            PrintStream out) {

        Translate translate = createTranslateService();
        Translate.TranslateOption srcLang = Translate.TranslateOption.sourceLanguage(sourceLang);
        Translate.TranslateOption tgtLang = Translate.TranslateOption.targetLanguage(targetLang);

        Translation translation = translate.translate(sourceText, srcLang, tgtLang);
        out.printf("Source Text:\n\tLang: %s, Text: %s\n", sourceLang, sourceText);
        out.printf("TranslatedText:\n\tLang: %s, Text: %s\n", targetLang,
                translation.getTranslatedText());
    }

    /**
     * Create Google Translate API Service.
     *
     * @return Google Translate Service
     */
    public static Translate createTranslateService() {
        return TranslateOptions.newBuilder().setApiKey("AIzaSyBwjSgsQ2eXcprAGk4fw1VxK7yee5wdhBQ").build().getService();
    }

}
