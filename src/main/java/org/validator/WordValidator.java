package org.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.word.model.Word;

/**
 * Created by mustafa on 12.03.2017.
 */
public class WordValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return Word.class.isAssignableFrom(aClass);
    }

    public void validate(Object o, Errors errors) {
        Word word = (Word) o;
        String vocable = word.getVocable();

        if(vocable.contains("1")) {
            errors.rejectValue("vocable", "required","Sayısal ifade içeremez");
        } else if(vocable.length() < 10) {
            errors.rejectValue("vocable", "required","10 karakterden küçük olamaz");
        }
    }
}
