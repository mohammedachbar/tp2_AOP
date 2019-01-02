package com.formation.spring.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAdherent {

	public void logDebutMethode(JoinPoint joinPoint) {
			final Object[] args = joinPoint.getArgs();
			final StringBuffer sb = new StringBuffer();
			sb.append(joinPoint.getSignature().toString());
			sb.append(" avec les parametres : (");
			for (int i = 0; i < args.length; i++) {
					sb.append(args[i]);
					if (i < args.length - 1) {
						sb.append(", ");
					}
			}
			sb.append(")");
			System.out.println(sb);
	}
	public void logFinMethode(StaticPart staticPart, Object result) {
			String name = staticPart.getSignature().toLongString();
			System.out.println(name + " returning: [" + result + "]");
	}

}