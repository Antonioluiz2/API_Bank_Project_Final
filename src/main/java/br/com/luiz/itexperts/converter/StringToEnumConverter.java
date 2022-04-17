package br.com.luiz.itexperts.converter;

import org.springframework.core.convert.converter.Converter;

@SuppressWarnings("rawtypes")
public class StringToEnumConverter<T extends Enum> implements Converter<String, T> {

    Class<T> classe;

    @SuppressWarnings("unchecked")
	@Override
    public T convert(String source) {
        try {
            return (T) Enum.valueOf(classe, source.toUpperCase());
        }
        catch (Exception e) {
            return null;
        }
    }
}