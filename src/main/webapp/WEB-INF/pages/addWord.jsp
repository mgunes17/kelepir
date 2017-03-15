<%--
  Created by IntelliJ IDEA.
  User: mustafa
  Date: 10.03.2017
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
</head>
<body>
    <h4>Kelime Ekleyin</h4>
    <form:form modelAttribute="word" action="/yenikelime.html" method="post">
        Kelime: <form:input type="text" id="vocable" path="vocable"/> <br/>
                <form:errors path="vocable"/>
        Tipi:
        <form:select path="usage.typeName">
            <form:options items="${usageTypes}" itemValue="typeName" itemLabel="typeName" />
        </form:select>

        <button type="submit">Ekle</button>
    </form:form>


    <h4>Çeviri Ekle</h4>
    <form:form modelAttribute="meaning" action="/yenianlam.html" method="post">
        Kelime Seçin
        <form:select path="word.id">
            <form:options items="${wordList}" itemValue="id" itemLabel="wordAndUsage"  />
        </form:select>
        Sözlük Anlamı <form:input type="text" id="lexicalMeaning" path="lexicalMeaning"/> <br/>
        Çevirisi <form:input type="text" id="meaningTranslation" path="translation"/><br/>

        <button type="submit">Kaydet</button>
    </form:form>

    <h4>Örnek Cümle Ekle</h4>
    <form:form modelAttribute="example" action="/yeniornek.html" method="post">
        Anlam Seçin
        <form:select path="meaning.id">
            <form:options items="${meaningList}" itemValue="id" itemLabel="lexicalMeaning"/><br/>
        </form:select>
        Cümleyi yazın
        <form:input type="text" path="sentence" id="sentence"/>
        Cümle Çevirisi(Boş Bırakılabilir)
        <form:input path="sentenceTranslation" id="sentenceTranslation" type="text"/>

        <button type="submit">Kaydet</button>

    </form:form>
</body>
</html>
