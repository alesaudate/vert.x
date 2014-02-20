package br.com.leonardo.vertx.chap1;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;


public class Server extends Verticle {

	@Override
	public void start() {
		vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {

			@Override
			public void handle(HttpServerRequest request) {
				request.response().sendFile("static/index.html");
			}

		}).listen(8080, "localhost");
	}
}