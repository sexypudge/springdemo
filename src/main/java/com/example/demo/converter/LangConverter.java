package com.example.demo.converter;

import com.example.demo.model.enums.LangEnum;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;

public class LangConverter implements Converter<String, LangEnum> {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(LangConverter.class);

    @Override
    public LangEnum convert(String source) {
        try {
            return LangEnum.valueOf(source);
        } catch (Exception exe){
            LOGGER.info("Label of LangEnum Enum is mismatched. Auto converted into LangEnum.EN");
            return LangEnum.en;
        }
    }
}
