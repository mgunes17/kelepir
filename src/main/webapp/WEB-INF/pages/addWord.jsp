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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script></head>
<body>
    <div class="jumbotron container-fluid">
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-3">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        Kelime Ekle
                    </div>
                    <div class="panel-body">
                        <form:form modelAttribute="word" action="/yenikelime.html" method="post">
                            <div class="form-group">
                                <label for="vocable">Kelime</label>
                                <form:input type="text" id="vocable" path="vocable" class="form-control"/>
                                <form:errors path="vocable"/>
                            </div>
                            <div class="form-group">
                                <label>Tipi</label>
                                <form:select path="usage.typeName" class="form-control">
                                    <form:options items="${usageTypes}" itemValue="typeName" itemLabel="typeName" />
                                </form:select>
                            </div>
                            <button type="submit" class="btn btn-success">Kaydet</button>
                        </form:form>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        Çeviri Ekle
                    </div>
                    <div class="panel-body">
                        <form:form modelAttribute="meaning" action="/yenianlam.html" method="post">
                            <div class="form-group">
                                <label>Kelime Seçin</label>
                                <form:select path="word.id" class="form-control">
                                    <form:options items="${wordList}" itemValue="id" itemLabel="wordAndUsage"  />
                                </form:select>
                            </div>
                            <div class="form-group">
                                <label for="lexicalMeaning">Sözlük Anlamı</label>
                                <form:input type="text" id="lexicalMeaning" path="lexicalMeaning" class="form-control"/>
                            </div>
                            <div class="form-group">
                                <label for="meaningTranslation">Çevirisi</label>
                                <form:input type="text" id="meaningTranslation" path="translation" class="form-control"/><br/>
                            </div>
                            <button type="submit" class="btn btn-success">Kaydet</button>
                        </form:form>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        Örnek Cümle
                    </div>
                    <div class="panel-body">
                        <form:form modelAttribute="example" action="/yeniornek.html" method="post">
                            <div class="form-group">
                                <label>Anlam Seçin</label>
                                <form:select path="meaning.id" class="form-control">
                                    <form:options items="${meaningList}" itemValue="id" itemLabel="lexicalMeaning"/>
                                </form:select>
                            </div>
                            <div class="form-group">
                                <label>Cümleyi Yazın</label
                                <form:input type="text" path="sentence" id="sentence" class="form-control"/>
                            </div>
                            <div class="form-group">
                                <label>Cümle Çevirisi</label>
                                <form:input path="sentenceTranslation" id="sentenceTranslation" type="text" class="form-control"/>
                            </div>
                            <button type="submit" class="btn btn-success">Kaydet</button>
                        </form:form>
                    </div>
                </div>

            </div>
        </div>
    </div>
</body>
</html>
