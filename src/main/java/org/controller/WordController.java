package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.validator.WordValidator;
import org.word.model.Example;
import org.word.model.Meaning;
import org.word.model.UsageType;
import org.word.model.Word;
import org.word.service.ExampleService;
import org.word.service.MeaningService;
import org.word.service.UsageTypeService;
import org.word.service.WordService;

import java.util.Date;
import java.util.List;

/**
 * Created by mustafa on 10.03.2017.
 */

@Controller
public class WordController {
    private WordService wordService;
    private UsageTypeService usageTypeService;
    private WordValidator wordValidator;
    private MeaningService meaningService;
    private ExampleService exampleService;

    //request-mapping
    @RequestMapping(value = "/yenikelime", params = "ekle")
    public String addWord() {
        return "addWord";
    }

    @RequestMapping(value = "/yenikelime", method = RequestMethod.POST)
    public String addNewWord(Word word, BindingResult bindingResult, Model model) {
        word.setRecordDate(new Date());
        wordService.save(word);
        model.addAttribute("wordList", words());
        return "addWord";
    }

    @RequestMapping(value = "/yenianlam", method = RequestMethod.POST)
    public String addNewMeaning(Meaning meaning, Model model) {
        meaningService.save(meaning);
        model.addAttribute("meaningList", meaningList());
        return "addWord";
    }

    @RequestMapping(value = "/yeniornek", method = RequestMethod.POST)
    public String addNewExample(Example example, Model model) {
        exampleService.saveExample(example);
        return "addWord";
    }

    //model-attribute
    @ModelAttribute("word")
    public void word(Word word, Model model) {
        model.addAttribute("word", word);
    }

    @ModelAttribute("usageTypes")
    public List<UsageType> customer() {
        List<UsageType> usageTypes = usageTypeService.allUsageTypes();
        return usageTypes;
    }

    @ModelAttribute("meaning")
    public void meaning(Meaning meaning, Model model) {
        model.addAttribute("meaning", meaning);
    }

    @ModelAttribute("wordList")
    public List<Word> words() {
        List<Word> words = wordService.allWords();
        return words;
    }

    @ModelAttribute("example")
    public void example(Example example, Model model) {
        model.addAttribute("example", example);
    }

    @ModelAttribute("meaningList")
    public List<Meaning> meaningList() {
        List<Meaning> meanings = meaningService.allMeanings();
        return meanings;
    }

    //setter
    public void setWordService(WordService wordService) {
        this.wordService = wordService;
    }

    public void setUsageTypeService(UsageTypeService usageTypeService) {
        this.usageTypeService = usageTypeService;
    }

    public void setWordValidator(WordValidator wordValidator) {
        this.wordValidator = wordValidator;
    }

    public void setMeaningService(MeaningService meaningService) {
        this.meaningService = meaningService;
    }

    public void setExampleService(ExampleService exampleService) {
        this.exampleService = exampleService;
    }
}
