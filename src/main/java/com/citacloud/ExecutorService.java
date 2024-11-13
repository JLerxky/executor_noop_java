package com.citacloud;

import blockchain.Blockchain;
import com.google.protobuf.ByteString;
import common.Common;
import executor.Executor;
import executor.ExecutorServiceGrpc;
import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;

@GrpcService
public class ExecutorService extends ExecutorServiceGrpc.ExecutorServiceImplBase {

    @Override
    public void exec(Blockchain.Block request, StreamObserver<Common.HashResponse> responseObserver) {
        System.out.println("exec start: " + request.getHeader().getProposer());
        responseObserver
                .onNext(Common.HashResponse.newBuilder().setStatus(Common.StatusCode.newBuilder().setCode(0).build())
                        .setHash(Common.Hash.newBuilder().setHash(request.getHeader().getProposer()).build()).build());
        responseObserver.onCompleted();
        System.out.println("exec end: " + request.getHeader().getProposer());
    }

    @Override
    public void call(Executor.CallRequest request, StreamObserver<Executor.CallResponse> responseObserver) {
        System.out.println("call start: " + request);
        responseObserver.onNext(Executor.CallResponse.newBuilder().setValue(ByteString.EMPTY).build());
        responseObserver.onCompleted();
        System.out.println("call end: " + request);
    }

}
