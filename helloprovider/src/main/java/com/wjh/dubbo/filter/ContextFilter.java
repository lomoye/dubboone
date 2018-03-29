package com.wjh.dubbo.filter;


import com.alibaba.dubbo.rpc.*;

/**
 * Created by lomoye on 2018/3/29.
 * 分片上下文信息过滤器
 */

public class ContextFilter implements Filter {
    /**
     * do invoke filter.
     * <p>
     * <code>
     * // before filter
     * Result result = invoker.invoke(invocation);
     * // after filter
     * return result;
     * </code>
     *
     * @param invoker    service
     * @param invocation invocation.
     * @return invoke result.
     * @throws RpcException
     * @see Invoker#invoke(Invocation)
     */
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {

        System.out.println(RpcContext.getContext().getAttachment("shard_id"));

        return invoker.invoke(invocation);
    }


}
