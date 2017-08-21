package com.javialej.xnbiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MAINController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		
		String response = " " +
				"<!DOCTYPE html>" + 
				"<html lang='en'>" + 
				"" + 
				"<head>" + 
				"" + 
				"    <meta charset='utf-8'>" + 
				"    <meta http-equiv='X-UA-Compatible' content='IE=edge'>" + 
				"    <meta name='viewport' content='width=device-width, initial-scale=1'>" + 
				"    <meta name='description' content=''>" + 
				"    <meta name='author' content=''>" + 
				"" + 
				"    <title>XN-Biblioteca Backend API</title>" + 
				"" + 
				"    <!-- Bootstrap Core CSS -->" + 
				"    <link href='/lib/bootstrap/css/bootstrap.min.css' rel='stylesheet'>" + 
				"" + 
				"    <!-- Custom Fonts -->" + 
				"    <link href='https://fonts.googleapis.com/css?family=Lato' rel='stylesheet'>" + 
				"    <link href='https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900' rel='stylesheet'>" + 
				"    <link href='https://fonts.googleapis.com/css?family=Muli' rel='stylesheet'>" + 
				"" + 
				"    <!-- Plugin CSS -->" + 
				"    <link rel='stylesheet' href='/lib/font-awesome/css/font-awesome.min.css'>" + 
				"    <link rel='stylesheet' href='/lib/simple-line-icons/css/simple-line-icons.css'>" + 
				"    <link rel='stylesheet' href='/lib/device-mockups/device-mockups.min.css'>" + 
				"" + 
				"    <!-- Theme CSS -->" + 
				"    <link href='/css/new-age.min.css' rel='stylesheet'>" + 
				"" + 
				"    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->" + 
				"    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->" + 
				"    <!--[if lt IE 9]>" + 
				"        <script src='https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js'></script>" + 
				"        <script src='https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js'></script>" + 
				"    <![endif]-->" + 
				"" + 
				"</head>" + 
				"" + 
				"<body id='page-top'>" + 
				"" + 
				"    <nav id='mainNav' class='navbar navbar-default navbar-fixed-top'>" + 
				"        <div class='container'>" + 
				"            <!-- Brand and toggle get grouped for better mobile display -->" + 
				"            <div class='navbar-header'>" + 
				"                <button type='button' class='navbar-toggle collapsed' data-toggle='collapse' data-target='#bs-example-navbar-collapse-1'>" + 
				"                    <span class='sr-only'>Toggle navigation</span> Menu <i class='fa fa-bars'></i>" + 
				"                </button>" + 
				"                <a class='navbar-brand page-scroll' href='#page-top'>XN-Biblioteca Backend API</a>" + 
				"            </div>" + 
				"" + 
				"            <!-- Collect the nav links, forms, and other content for toggling -->" + 
				"            <div class='collapse navbar-collapse' id='bs-example-navbar-collapse-1'>" + 
				"                <ul class='nav navbar-nav navbar-right'>" + 
				"                    <li>" + 
				"                        <a class='page-scroll' href='#'>API Doc</a>" + 
				"                    </li>" + 
				"                    <li>" + 
				"                        <a class='page-scroll' href='#'>Contact</a>" + 
				"                    </li>" + 
				"                </ul>" + 
				"            </div>" + 
				"            <!-- /.navbar-collapse -->" + 
				"        </div>" + 
				"        <!-- /.container-fluid -->" + 
				"    </nav>" + 
				"" + 
				"    <header>" + 
				"        <div class='container'>" + 
				"            <div class='row'>" + 
				"                <div class='col-sm-7'>" + 
				"                    <div class='header-content'>" + 
				"                        <div class='header-content-inner'>" + 
				"                            <h1>XN-Biblioteca Backend API</h1>" + 
				"                            <h3>Javier Alejandro Pérez - FRoM</h3>" + 
				"                        </div>" + 
				"                    </div>" + 
				"                </div>" + 
				"                <div class='col-sm-5'>" + 
				"                    <div class='device-container'>" + 
				"                        <div class='device-mockup iphone6_plus portrait white'>" + 
				"                            <div class='device'>" + 
				"                                <div class='screen'>" + 
				"                                    <!-- Demo image for screen mockup, you can put an image here, some HTML, an animation, video, or anything else! -->" + 
				"                                    <img src='/img/demo-screen-1.jpg' class='img-responsive' alt=''>" + 
				"                                </div>" + 
				"                                <div class='button'>" + 
				"                                    <!-- You can hook the 'home button' to some JavaScript events or just remove it -->" + 
				"                                </div>" + 
				"                            </div>" + 
				"                        </div>" + 
				"                    </div>" + 
				"                </div>" + 
				"            </div>" + 
				"        </div>" + 
				"    </header>" +  
				"" + 
				"    <section class='cta'>" + 
				"        <div class='cta-content'>" + 
				"            <div class='container'>" + 
				"                <h2>Construyendo el API Client</h2>" +  
				"            </div>" + 
				"        </div>" + 
				"        <div class='overlay'></div>" + 
				"    </section>" + 
				"" + 
				"    <section id='contact' class='contact bg-primary'>" + 
				"        <div class='container'>" +
				"            <ul class='list-inline list-social'>" + 
				"                <li class='social-twitter'>" + 
				"                    <a href='#'><i class='fa fa-twitter'></i></a>" + 
				"                </li>" + 
				"                <li class='social-facebook'>" + 
				"                    <a href='#'><i class='fa fa-facebook'></i></a>" + 
				"                </li>" + 
				"                <li class='social-google-plus'>" + 
				"                    <a href='#'><i class='fa fa-google-plus'></i></a>" + 
				"                </li>" + 
				"            </ul>" + 
				"        </div>" + 
				"    </section>" + 
				"" + 
				"    <footer>" + 
				"        <div class='container'>" + 
				"            <p>&copy; 2017 EISI UIS. All Rights Reserved.</p>" + 
				"            <ul class='list-inline'>" + 
				"                <li>" + 
				"                    <a href='#'>Privacy</a>" + 
				"                </li>" + 
				"                <li>" + 
				"                    <a href='#'>Terms</a>" + 
				"                </li>" + 
				"                <li>" + 
				"                    <a href='#'>FAQ</a>" + 
				"                </li>" + 
				"            </ul>" + 
				"        </div>" + 
				"    </footer>" + 
				"" + 
				"    <!-- jQuery -->" + 
				"    <script src='/lib/jquery/jquery.min.js'></script>" + 
				"" + 
				"    <!-- Bootstrap Core JavaScript -->" + 
				"    <script src='/lib/bootstrap/js/bootstrap.min.js'></script>" + 
				"" + 
				"    <!-- Plugin JavaScript -->" + 
				"    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js'></script>" + 
				"" + 
				"    <!-- Theme JavaScript -->" + 
				"    <script src='/js/new-age.min.js'></script>" + 
				"" + 
				"</body>" + 
				"" + 
				"</html>";

		return response;
	}
}
