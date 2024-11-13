package com.citacloud;

import blockchain.Blockchain.Block;

import com.google.protobuf.ByteString;
import common.Common;
import common.Common.HashResponse;
import executor.Executor;
import executor.Executor.CallRequest;
import executor.Executor.CallResponse;
import executor.ExecutorService;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class ExecutorGrpcService implements ExecutorService {

    @Override
    public Uni<HashResponse> exec(Block request) {
        return Uni.createFrom()
                .item(() -> Common.HashResponse.newBuilder()
                        .setStatus(Common.StatusCode.newBuilder().setCode(0).build())
                        .setHash(Common.Hash.newBuilder().setHash(request.getHeader().getProposer()).build()).build());
    }

    @Override
    public Uni<CallResponse> call(CallRequest request) {
        return Uni.createFrom()
                .item(() -> Executor.CallResponse.newBuilder().setValue(ByteString.EMPTY).build());
    }

}
