package com.citacloud;

import common.Common.Hash;
import evm.Evm.Balance;
import evm.Evm.BlockNumber;
import evm.Evm.ByteAbi;
import evm.Evm.ByteCode;
import evm.Evm.ByteQuota;
import evm.Evm.GetAbiRequest;
import evm.Evm.GetBalanceRequest;
import evm.Evm.GetCodeRequest;
import evm.Evm.GetStorageAtRequest;
import evm.Evm.GetTransactionCountRequest;
import evm.Evm.Nonce;
import evm.Evm.Receipt;
import evm.Evm.ReceiptProof;
import evm.Evm.RootsInfo;
import evm.RPCService;
import executor.Executor.CallRequest;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class ExecutorRpcGrpcService implements RPCService {

    @Override
    public Uni<Receipt> getTransactionReceipt(Hash request) {
        // TODO
        return Uni.createFrom()
                .item(Receipt.newBuilder().build());
    }

    @Override
    public Uni<ByteCode> getCode(GetCodeRequest request) {
        // TODO
        return Uni.createFrom()
                .item(ByteCode.newBuilder().build());
    }

    @Override
    public Uni<Balance> getBalance(GetBalanceRequest request) {
        // TODO
        return Uni.createFrom()
                .item(Balance.newBuilder().build());
    }

    @Override
    public Uni<Nonce> getTransactionCount(GetTransactionCountRequest request) {
        // TODO
        return Uni.createFrom()
                .item(Nonce.newBuilder().build());
    }

    @Override
    public Uni<ByteAbi> getAbi(GetAbiRequest request) {
        // TODO
        return Uni.createFrom()
                .item(ByteAbi.newBuilder().build());
    }

    @Override
    public Uni<ByteQuota> estimateQuota(CallRequest request) {
        // TODO
        return Uni.createFrom()
                .item(ByteQuota.newBuilder().build());
    }

    @Override
    public Uni<ReceiptProof> getReceiptProof(Hash request) {
        // TODO
        return Uni.createFrom()
                .item(ReceiptProof.newBuilder().build());
    }

    @Override
    public Uni<RootsInfo> getRootsInfo(BlockNumber request) {
        // TODO
        return Uni.createFrom()
                .item(RootsInfo.newBuilder().build());
    }

    @Override
    public Uni<Hash> getStorageAt(GetStorageAtRequest request) {
        // TODO
        return Uni.createFrom()
                .item(Hash.newBuilder().build());
    }

}
