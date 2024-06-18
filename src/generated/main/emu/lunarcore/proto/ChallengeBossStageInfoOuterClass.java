// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class ChallengeBossStageInfoOuterClass {
  /**
   * <pre>
   *  Gbmdggdknmb
   * </pre>
   *
   * Protobuf type {@code ChallengeBossStageInfo}
   */
  public static final class ChallengeBossStageInfo extends ProtoMessage<ChallengeBossStageInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 kljpbaagnfn = 11;</code>
     */
    private int kljpbaagnfn;

    /**
     * <code>optional uint32 daimooemhjf = 14;</code>
     */
    private int daimooemhjf;

    /**
     * <code>optional bool is_win = 5;</code>
     */
    private boolean isWin;

    /**
     * <code>optional bool nagjmpmhmmc = 7;</code>
     */
    private boolean nagjmpmhmmc;

    private ChallengeBossStageInfo() {
    }

    /**
     * <pre>
     *  Gbmdggdknmb
     * </pre>
     *
     * @return a new empty instance of {@code ChallengeBossStageInfo}
     */
    public static ChallengeBossStageInfo newInstance() {
      return new ChallengeBossStageInfo();
    }

    /**
     * <code>optional uint32 kljpbaagnfn = 11;</code>
     * @return whether the kljpbaagnfn field is set
     */
    public boolean hasKljpbaagnfn() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 kljpbaagnfn = 11;</code>
     * @return this
     */
    public ChallengeBossStageInfo clearKljpbaagnfn() {
      bitField0_ &= ~0x00000001;
      kljpbaagnfn = 0;
      return this;
    }

    /**
     * <code>optional uint32 kljpbaagnfn = 11;</code>
     * @return the kljpbaagnfn
     */
    public int getKljpbaagnfn() {
      return kljpbaagnfn;
    }

    /**
     * <code>optional uint32 kljpbaagnfn = 11;</code>
     * @param value the kljpbaagnfn to set
     * @return this
     */
    public ChallengeBossStageInfo setKljpbaagnfn(final int value) {
      bitField0_ |= 0x00000001;
      kljpbaagnfn = value;
      return this;
    }

    /**
     * <code>optional uint32 daimooemhjf = 14;</code>
     * @return whether the daimooemhjf field is set
     */
    public boolean hasDaimooemhjf() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 daimooemhjf = 14;</code>
     * @return this
     */
    public ChallengeBossStageInfo clearDaimooemhjf() {
      bitField0_ &= ~0x00000002;
      daimooemhjf = 0;
      return this;
    }

    /**
     * <code>optional uint32 daimooemhjf = 14;</code>
     * @return the daimooemhjf
     */
    public int getDaimooemhjf() {
      return daimooemhjf;
    }

    /**
     * <code>optional uint32 daimooemhjf = 14;</code>
     * @param value the daimooemhjf to set
     * @return this
     */
    public ChallengeBossStageInfo setDaimooemhjf(final int value) {
      bitField0_ |= 0x00000002;
      daimooemhjf = value;
      return this;
    }

    /**
     * <code>optional bool is_win = 5;</code>
     * @return whether the isWin field is set
     */
    public boolean hasIsWin() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional bool is_win = 5;</code>
     * @return this
     */
    public ChallengeBossStageInfo clearIsWin() {
      bitField0_ &= ~0x00000004;
      isWin = false;
      return this;
    }

    /**
     * <code>optional bool is_win = 5;</code>
     * @return the isWin
     */
    public boolean getIsWin() {
      return isWin;
    }

    /**
     * <code>optional bool is_win = 5;</code>
     * @param value the isWin to set
     * @return this
     */
    public ChallengeBossStageInfo setIsWin(final boolean value) {
      bitField0_ |= 0x00000004;
      isWin = value;
      return this;
    }

    /**
     * <code>optional bool nagjmpmhmmc = 7;</code>
     * @return whether the nagjmpmhmmc field is set
     */
    public boolean hasNagjmpmhmmc() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional bool nagjmpmhmmc = 7;</code>
     * @return this
     */
    public ChallengeBossStageInfo clearNagjmpmhmmc() {
      bitField0_ &= ~0x00000008;
      nagjmpmhmmc = false;
      return this;
    }

    /**
     * <code>optional bool nagjmpmhmmc = 7;</code>
     * @return the nagjmpmhmmc
     */
    public boolean getNagjmpmhmmc() {
      return nagjmpmhmmc;
    }

    /**
     * <code>optional bool nagjmpmhmmc = 7;</code>
     * @param value the nagjmpmhmmc to set
     * @return this
     */
    public ChallengeBossStageInfo setNagjmpmhmmc(final boolean value) {
      bitField0_ |= 0x00000008;
      nagjmpmhmmc = value;
      return this;
    }

    @Override
    public ChallengeBossStageInfo copyFrom(final ChallengeBossStageInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        kljpbaagnfn = other.kljpbaagnfn;
        daimooemhjf = other.daimooemhjf;
        isWin = other.isWin;
        nagjmpmhmmc = other.nagjmpmhmmc;
      }
      return this;
    }

    @Override
    public ChallengeBossStageInfo mergeFrom(final ChallengeBossStageInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasKljpbaagnfn()) {
        setKljpbaagnfn(other.kljpbaagnfn);
      }
      if (other.hasDaimooemhjf()) {
        setDaimooemhjf(other.daimooemhjf);
      }
      if (other.hasIsWin()) {
        setIsWin(other.isWin);
      }
      if (other.hasNagjmpmhmmc()) {
        setNagjmpmhmmc(other.nagjmpmhmmc);
      }
      return this;
    }

    @Override
    public ChallengeBossStageInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      kljpbaagnfn = 0;
      daimooemhjf = 0;
      isWin = false;
      nagjmpmhmmc = false;
      return this;
    }

    @Override
    public ChallengeBossStageInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChallengeBossStageInfo)) {
        return false;
      }
      ChallengeBossStageInfo other = (ChallengeBossStageInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasKljpbaagnfn() || kljpbaagnfn == other.kljpbaagnfn)
        && (!hasDaimooemhjf() || daimooemhjf == other.daimooemhjf)
        && (!hasIsWin() || isWin == other.isWin)
        && (!hasNagjmpmhmmc() || nagjmpmhmmc == other.nagjmpmhmmc);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(kljpbaagnfn);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(daimooemhjf);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 40);
        output.writeBoolNoTag(isWin);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 56);
        output.writeBoolNoTag(nagjmpmhmmc);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(kljpbaagnfn);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(daimooemhjf);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChallengeBossStageInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // kljpbaagnfn
            kljpbaagnfn = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // daimooemhjf
            daimooemhjf = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // isWin
            isWin = input.readBool();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // nagjmpmhmmc
            nagjmpmhmmc = input.readBool();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.kljpbaagnfn, kljpbaagnfn);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.daimooemhjf, daimooemhjf);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeBool(FieldNames.isWin, isWin);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeBool(FieldNames.nagjmpmhmmc, nagjmpmhmmc);
      }
      output.endObject();
    }

    @Override
    public ChallengeBossStageInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 211562154: {
            if (input.isAtField(FieldNames.kljpbaagnfn)) {
              if (!input.trySkipNullValue()) {
                kljpbaagnfn = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1998280347: {
            if (input.isAtField(FieldNames.daimooemhjf)) {
              if (!input.trySkipNullValue()) {
                daimooemhjf = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100482642:
          case -1179753657: {
            if (input.isAtField(FieldNames.isWin)) {
              if (!input.trySkipNullValue()) {
                isWin = input.readBool();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2144020241: {
            if (input.isAtField(FieldNames.nagjmpmhmmc)) {
              if (!input.trySkipNullValue()) {
                nagjmpmhmmc = input.readBool();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public ChallengeBossStageInfo clone() {
      return new ChallengeBossStageInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChallengeBossStageInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChallengeBossStageInfo(), data).checkInitialized();
    }

    public static ChallengeBossStageInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeBossStageInfo(), input).checkInitialized();
    }

    public static ChallengeBossStageInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeBossStageInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChallengeBossStageInfo messages
     */
    public static MessageFactory<ChallengeBossStageInfo> getFactory() {
      return ChallengeBossStageInfoFactory.INSTANCE;
    }

    private enum ChallengeBossStageInfoFactory implements MessageFactory<ChallengeBossStageInfo> {
      INSTANCE;

      @Override
      public ChallengeBossStageInfo create() {
        return ChallengeBossStageInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName kljpbaagnfn = FieldName.forField("kljpbaagnfn");

      static final FieldName daimooemhjf = FieldName.forField("daimooemhjf");

      static final FieldName isWin = FieldName.forField("isWin", "is_win");

      static final FieldName nagjmpmhmmc = FieldName.forField("nagjmpmhmmc");
    }
  }
}