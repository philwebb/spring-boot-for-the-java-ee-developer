package sbjee;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LogFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.err.println("--> " + ((HttpServletRequest) request).getRequestURI());
		Instant start = Instant.now();
		chain.doFilter(request, response);
		System.err.println("<-- " + Duration.between(start, Instant.now()));
	}

	@Override
	public void destroy() {
	}

}
