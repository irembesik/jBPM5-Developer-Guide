
package com.salaboy.jbpm5.dev.guide.executor;


/**
 *
 * @author salaboy
 */
public interface Executor extends Service{
    public void scheduleRequest(String requestName, CommandContext ctx);
    public void cancelRequest(String key);
}