<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/front/taglib.jsp"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html>
<head>
	<title><sitemesh:title default="欢迎光临"/> - ${site.title} - Powered By MyExam</title>
	<%@include file="/WEB-INF/views/include/front/head.jsp" %>
	<!-- Baidu tongji analytics --><script>var _hmt=_hmt||[];(function(){var hm=document.createElement("script");hm.src="//hm.baidu.com/hm.js?82116c626a8d504a5c0675073362ef6f";var s=document.getElementsByTagName("script")[0];s.parentNode.insertBefore(hm,s);})();</script>
	<sitemesh:head/>
</head>
<body>
	<div class="navbar navbar-fixed-top" style="position:static;margin-bottom:10px;">
		<div class="navbar-inner">
			<div class="container">
			  
				<div class="nav-collapse">
					<ul id="main_nav" class="nav nav-pills">
					 	<li class="${isIndex?'active':''}"><a href="${ctxFront}/index-1${fns:getUrlSuffix()}"><span>${site.id eq 1?'首　 页':'返回主站'}</span></a></li>
					
						<li id="siteSwitch" class="dropdown">
						   	<a class="dropdown-toggle" data-toggle="dropdown" href="#" title="站点"><i class="icon-retweet"></i></a>
							<ul class="dropdown-menu">
						  		<c:forEach items="${fnc:getSiteList()}" var="site"><li><a href="#" onclick="location='${ctxFront}/index-${site.id}${urlSuffix}'">${site.title}</a></li></c:forEach>
							</ul>
						</li>
					  	<li id="themeSwitch" class="dropdown">
					      	<a class="dropdown-toggle" data-toggle="dropdown" href="#" title="主题切换"><i class="icon-th-large"></i></a>
					    <ul class="dropdown-menu">
					      <c:forEach items="${fns:getDictList('theme')}" var="dict"><li><a href="#" onclick="location='${ctx}/theme/${dict.value}?url='+location.href">${dict.label}</a></li></c:forEach>
					</ul>
					<!--[if lte IE 6]><script type="text/javascript">$('#themeSwitch').hide();</script><![endif]-->
					</li>
					</ul>
					<form class="navbar-form pull-right" action="${ctxFront}/search" method="get">
						<input type="text" name="q" maxlength="20" style="width:65px;" placeholder="全站搜索..." value="${q}">
					</form>
				</div><!--/.nav-collapse -->
			</div>
		</div>
    </div>
	<div class="container">
		<div class="content">
			<sitemesh:body/>
		</div>
		<hr style="margin:20px 0 10px;">
		<footer>
			<div class="footer_nav"><a href="${ctxFront}/guestbook" target="_blank">公共留言</a> | <a href="${ctxFront}/search" target="_blank">全站搜索</a> | <a href="${ctxFront}/map-${site.id}${fns:getUrlSuffix()}" target="_blank">站点地图</a> | <a href="mailto:thinkgem@163.com">技术支持</a> | <a href="${ctxAdmin}" target="_blank">后台管理</a></div>
			<div class="pull-right">${fns:getDate('yyyy年MM月dd日 E')}</div><div class="copyright">${site.copyright}</div>
      	</footer>
    </div> <!-- /container -->
</body>
</html>