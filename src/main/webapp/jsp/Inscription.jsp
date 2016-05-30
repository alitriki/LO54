<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Online courses</title>
        <link rel="stylesheet" href="ressources/css/polices.css" />
        <link rel="stylesheet" href="ressources//css/bootstrap.css" />
        <link rel="stylesheet" href="ressources//css/style.css" />
        <link rel="icon" type="image/gif" href="ressources//images/icone.gif" />

    </head>

    <body>	    
        <div class="container">
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">

                        <a class="navbar-brand" href="#">Welcome to Online Courses !</a>
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse">
                        <ul class="nav navbar-nav">
                            <li class="active"><a href="Courses">Home <span class="sr-only">(current)</span></a></li>

                        </ul>
                        <form class="navbar-form navbar-right" role="search" action="CoursesKeyWord" method="POST">
                            <div class="form-group">
                                <input type="text" name="key" class="form-control" placeholder="Key word">
                            </div>
                            <button type="submit" class="btn btn-default">Search</button>
                        </form>

                        <!--  -->
                        <ul class="nav navbar-nav">
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Advanced search <span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <div class="col-xs-12">                 		

                                            <form class="form form-group" action="CoursesAtLocation" method="POST">
                                                <label class="label label-default">Search by location</label>
                                                <br/>
                                                <div class="input-group">

                                                    <select name="city" id="location" class="form-control">
                                                        <c:forEach items="${requestScope.allLocations}" var="location">
                                                            <option id="city" name="city" value="${location}">${location}</option>
                                                        </c:forEach>
                                                    </select>
                                                    <span class="input-group-btn">
                                                        <button class="btn btn-default" type="submit">Go!</button>
                                                    </span>
                                                </div>     
                                            </form>
                                        </div>
                                    </li>

                                    <li>.......................................................................</li>
                                    <br />
                                    <div class="col-xs-12">                 		

                                        <form class="form-group" role="search" action="CoursesAtDate" method="POST">
                                            <label class="label label-default">Search by date</label>
                                            <br/>
                                            <div class="input-group">
                                                <input type="date" id="date" name="date" class="form-control" placeholder="date" autocomplete="off">
                                                    <span class="input-group-btn">
                                                        <button class="btn btn-default" type="submit">Go!</button>
                                                    </span>
                                            </div>     
                                        </form>
                                    </div>

                                </ul>
                            </li>
                        </ul>

                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>

            <div>
                <div class="panel panel-black" style="">
                    <div class="panel-heading text-center">
                        Registration
                    </div>
                
                <div class="panel-body" style="min-height: 10; max-height: 10;overflow-y: scroll"> 
                
                  <div class="col-xs-4">
                    <div class="thumbnail">
                      <img src="ressources/img/${requestScope.course.picture}" alt="..." class="img-responsive img-rounded" style="width:300px"/>
                      <div class="caption text-center">
                        <h3 class="text-capitalize">${requestScope.course.code}</h3>
                        <h4>
                        <strong>${requestScope.course.title}</strong>
                        </h4>
                        <div class="caption">
                            <blockquote>
                            Session from :
                            	<footer>
                                    <fmt:formatDate type="date" value="${requestScope.session.startDate}" pattern="dd-MM-yyyy"/>  <strong> to </strong>   <fmt:formatDate type="date" value="${requestScope.session.endDate}" pattern="dd-MM-yyyy"/>
                                </footer>
                            </blockquote>
                          </div>
                        
                      </div>
                    </div>
                  </div>
                  
                  <div class="col-xs-8">
                   	
                   		   <br />	
                           <br />
                           <br />
                           <br />
                           <br />
                  
                  	<form id="client" class="form" method="post" action="AddClient">
                            <input type="hidden"  name="id" value="${requestScope.session.id}"></input>
                    	<div class="col-xs-6">
                          <label class="label label-default" for="nom">Last name</label>
                          <input class="form-control input-lg nom" type="text" name="lastName" id="nom" required="required" spellcheck="false" tabindex="1" placeholder="Last name" maxlength="20"/>
                        </div><!--nom -->
                         
                        <div class="col-xs-6">
                          <label class="label label-default" for="prenoms">First name</label>
                          <input class="form-control input-lg prenom" type="text" name="firstName" id="prenoms" required="required" spellcheck="false" tabindex="2" placeholder="First name" maxlength="35"/>
                        </div><!--prénoms -->
                        
                           <br />	
                           <br />
                           <br />
                           <br /> 
                           
                        
                        <div class="col-xs-6">
                          <label class="label label-default" for="telephoneDomicile">Phone</label>
                          <input class="form-control input-lg telephone" type="tel" name="phone" id="telephone" spellcheck="false" tabindex="3" placeholder="Phone number" maxlength="13" required="required"/>
           				</div> <!--telephone 1 -->
                        
                        <div class="col-xs-6">
                            <label class="label label-default" for="email">E-Mail</label>
                            <input class="form-control input-lg email" type="email" name="email" id="email" tabindex="4" placeholder="E-mail address" maxlength="35"/>
          				</div> <!--E-Mail --> 
                        
                           <br />	
                           <br />
                           <br />
                           <br /> 
                           
                         
                        <div class="col-xs-12">
                          <label class="label label-default" for="adresse">Address</label>
                          <input class="form-control input-lg adresse" type="text" name="address" id="adresse" tabindex="5" placeholder="Address" maxlength="35"  required="required"/>
                        </div> <!--Adresse -->   
                           
                           <br />	
                           <br />
                           <br />
                           <br /> 
                           
                           <div class="col-xs-6 text-left">
                            <button type="reset" class="btn btn-danger btn-lg">Cancel</button>
                            
                           </div>
                           
                           <div class="col-xs-6 text-right">
                            <button type="submit" class="btn btn-success btn-lg">Submit</button>  
                           </div>
           
                    </form>
            
                  </div>
                  	
            </div>
        </div> 
	</div>
    
        
<script type="text/javascript" src="ressources/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="ressources/js/bootstrap.js"></script>
<script type="text/javascript" src="ressources/js/script.js"></script>


</body>
</html>
