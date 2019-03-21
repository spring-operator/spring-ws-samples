/*
 * Copyright 2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ws.samples.stockquote;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.ws.samples.stockquote.ws.StockServiceConfiguration;
import org.springframework.ws.transport.http.WebServiceMessageReceiverHttpHandler;
import org.springframework.ws.transport.http.WsdlDefinitionHttpHandler;

public class Driver {

    public static void main(String[] args) throws IOException {
	    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
			    StockServiceConfiguration.class);

	    HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), -1);
	    httpServer.createContext("/StockService", applicationContext.getBean(
			    WebServiceMessageReceiverHttpHandler.class));
	    httpServer.createContext("/StockService.wsdl", applicationContext.getBean(
			    WsdlDefinitionHttpHandler.class));

	    httpServer.start();
        System.out.println();
        System.out.println("Press [Enter] to shut down...");
        System.in.read();
	    httpServer.stop(0);
    }

}
