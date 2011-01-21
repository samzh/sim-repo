<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>主题 - ${subject.title}</title>
<script src="<c:url value="../ckeditor/ckeditor.js" />"></script>
<script type="text/javascript">
function doSubmit() {
	document.forms[0].content.value = CKEDITOR.instances.content.getData();
	document.forms[0].submit(); 
}
</script>
<link href="<c:url value='/css/main.css' />" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
<div id="container">
	<div id="header"></div>
	<div id="mainbox">
		<div id="menu"></div>
		<div id="mainContent">
			<form:form modelAttribute="subject" action="save" method="post">
			<h1><form:input path="title" cssClass="main-title" /></h1>
			<div>内容：<form:textarea path="content" rows="15" cols="40" />
						<script type="text/javascript">
							CKEDITOR.replace('content', {
								customConfig : 'config.js'
							});
						</script>
			</div>
			<div><input type="button" onclick="doSubmit()" value="submit" /></div>
			</form:form>
		</div>
	</div>
	<div id="footer"></div>
</div>
</body>
</html>