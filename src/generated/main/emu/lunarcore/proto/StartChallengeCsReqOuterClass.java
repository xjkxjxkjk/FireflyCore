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
import us.hebi.quickbuf.RepeatedInt;

public final class StartChallengeCsReqOuterClass {
  /**
   * Protobuf type {@code StartChallengeCsReq}
   */
  public static final class StartChallengeCsReq extends ProtoMessage<StartChallengeCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 challenge_id = 4;</code>
     */
    private int challengeId;

    /**
     * <code>optional .StartChallengeInfo ext_info = 5;</code>
     */
    private final StartChallengeInfoOuterClass.StartChallengeInfo extInfo = StartChallengeInfoOuterClass.StartChallengeInfo.newInstance();

    /**
     * <code>repeated uint32 lineup1 = 9;</code>
     */
    private final RepeatedInt lineup1 = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated uint32 lineup2 = 12;</code>
     */
    private final RepeatedInt lineup2 = RepeatedInt.newEmptyInstance();

    private StartChallengeCsReq() {
    }

    /**
     * @return a new empty instance of {@code StartChallengeCsReq}
     */
    public static StartChallengeCsReq newInstance() {
      return new StartChallengeCsReq();
    }

    /**
     * <code>optional uint32 challenge_id = 4;</code>
     * @return whether the challengeId field is set
     */
    public boolean hasChallengeId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 challenge_id = 4;</code>
     * @return this
     */
    public StartChallengeCsReq clearChallengeId() {
      bitField0_ &= ~0x00000001;
      challengeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 challenge_id = 4;</code>
     * @return the challengeId
     */
    public int getChallengeId() {
      return challengeId;
    }

    /**
     * <code>optional uint32 challenge_id = 4;</code>
     * @param value the challengeId to set
     * @return this
     */
    public StartChallengeCsReq setChallengeId(final int value) {
      bitField0_ |= 0x00000001;
      challengeId = value;
      return this;
    }

    /**
     * <code>optional .StartChallengeInfo ext_info = 5;</code>
     * @return whether the extInfo field is set
     */
    public boolean hasExtInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .StartChallengeInfo ext_info = 5;</code>
     * @return this
     */
    public StartChallengeCsReq clearExtInfo() {
      bitField0_ &= ~0x00000002;
      extInfo.clear();
      return this;
    }

    /**
     * <code>optional .StartChallengeInfo ext_info = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableExtInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public StartChallengeInfoOuterClass.StartChallengeInfo getExtInfo() {
      return extInfo;
    }

    /**
     * <code>optional .StartChallengeInfo ext_info = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public StartChallengeInfoOuterClass.StartChallengeInfo getMutableExtInfo() {
      bitField0_ |= 0x00000002;
      return extInfo;
    }

    /**
     * <code>optional .StartChallengeInfo ext_info = 5;</code>
     * @param value the extInfo to set
     * @return this
     */
    public StartChallengeCsReq setExtInfo(
        final StartChallengeInfoOuterClass.StartChallengeInfo value) {
      bitField0_ |= 0x00000002;
      extInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated uint32 lineup1 = 9;</code>
     * @return whether the lineup1 field is set
     */
    public boolean hasLineup1() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated uint32 lineup1 = 9;</code>
     * @return this
     */
    public StartChallengeCsReq clearLineup1() {
      bitField0_ &= ~0x00000004;
      lineup1.clear();
      return this;
    }

    /**
     * <code>repeated uint32 lineup1 = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableLineup1()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getLineup1() {
      return lineup1;
    }

    /**
     * <code>repeated uint32 lineup1 = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableLineup1() {
      bitField0_ |= 0x00000004;
      return lineup1;
    }

    /**
     * <code>repeated uint32 lineup1 = 9;</code>
     * @param value the lineup1 to add
     * @return this
     */
    public StartChallengeCsReq addLineup1(final int value) {
      bitField0_ |= 0x00000004;
      lineup1.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 lineup1 = 9;</code>
     * @param values the lineup1 to add
     * @return this
     */
    public StartChallengeCsReq addAllLineup1(final int... values) {
      bitField0_ |= 0x00000004;
      lineup1.addAll(values);
      return this;
    }

    /**
     * <code>repeated uint32 lineup2 = 12;</code>
     * @return whether the lineup2 field is set
     */
    public boolean hasLineup2() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated uint32 lineup2 = 12;</code>
     * @return this
     */
    public StartChallengeCsReq clearLineup2() {
      bitField0_ &= ~0x00000008;
      lineup2.clear();
      return this;
    }

    /**
     * <code>repeated uint32 lineup2 = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableLineup2()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getLineup2() {
      return lineup2;
    }

    /**
     * <code>repeated uint32 lineup2 = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableLineup2() {
      bitField0_ |= 0x00000008;
      return lineup2;
    }

    /**
     * <code>repeated uint32 lineup2 = 12;</code>
     * @param value the lineup2 to add
     * @return this
     */
    public StartChallengeCsReq addLineup2(final int value) {
      bitField0_ |= 0x00000008;
      lineup2.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 lineup2 = 12;</code>
     * @param values the lineup2 to add
     * @return this
     */
    public StartChallengeCsReq addAllLineup2(final int... values) {
      bitField0_ |= 0x00000008;
      lineup2.addAll(values);
      return this;
    }

    @Override
    public StartChallengeCsReq copyFrom(final StartChallengeCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        challengeId = other.challengeId;
        extInfo.copyFrom(other.extInfo);
        lineup1.copyFrom(other.lineup1);
        lineup2.copyFrom(other.lineup2);
      }
      return this;
    }

    @Override
    public StartChallengeCsReq mergeFrom(final StartChallengeCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasChallengeId()) {
        setChallengeId(other.challengeId);
      }
      if (other.hasExtInfo()) {
        getMutableExtInfo().mergeFrom(other.extInfo);
      }
      if (other.hasLineup1()) {
        getMutableLineup1().addAll(other.lineup1);
      }
      if (other.hasLineup2()) {
        getMutableLineup2().addAll(other.lineup2);
      }
      return this;
    }

    @Override
    public StartChallengeCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      challengeId = 0;
      extInfo.clear();
      lineup1.clear();
      lineup2.clear();
      return this;
    }

    @Override
    public StartChallengeCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      extInfo.clearQuick();
      lineup1.clear();
      lineup2.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof StartChallengeCsReq)) {
        return false;
      }
      StartChallengeCsReq other = (StartChallengeCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasChallengeId() || challengeId == other.challengeId)
        && (!hasExtInfo() || extInfo.equals(other.extInfo))
        && (!hasLineup1() || lineup1.equals(other.lineup1))
        && (!hasLineup2() || lineup2.equals(other.lineup2));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(challengeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 42);
        output.writeMessageNoTag(extInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < lineup1.length(); i++) {
          output.writeRawByte((byte) 72);
          output.writeUInt32NoTag(lineup1.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < lineup2.length(); i++) {
          output.writeRawByte((byte) 96);
          output.writeUInt32NoTag(lineup2.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(challengeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(extInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * lineup1.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(lineup1);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * lineup2.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(lineup2);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StartChallengeCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // challengeId
            challengeId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // extInfo
            input.readMessage(extInfo);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // lineup1 [packed=true]
            input.readPackedUInt32(lineup1, tag);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // lineup2 [packed=true]
            input.readPackedUInt32(lineup2, tag);
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
          case 72: {
            // lineup1 [packed=false]
            tag = input.readRepeatedUInt32(lineup1, tag);
            bitField0_ |= 0x00000004;
            break;
          }
          case 96: {
            // lineup2 [packed=false]
            tag = input.readRepeatedUInt32(lineup2, tag);
            bitField0_ |= 0x00000008;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.challengeId, challengeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.extInfo, extInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedUInt32(FieldNames.lineup1, lineup1);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedUInt32(FieldNames.lineup2, lineup2);
      }
      output.endObject();
    }

    @Override
    public StartChallengeCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -689112866:
          case 112359031: {
            if (input.isAtField(FieldNames.challengeId)) {
              if (!input.trySkipNullValue()) {
                challengeId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1306498449:
          case -1826570228: {
            if (input.isAtField(FieldNames.extInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(extInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 176922754: {
            if (input.isAtField(FieldNames.lineup1)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(lineup1);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 176922755: {
            if (input.isAtField(FieldNames.lineup2)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(lineup2);
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
    public StartChallengeCsReq clone() {
      return new StartChallengeCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StartChallengeCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StartChallengeCsReq(), data).checkInitialized();
    }

    public static StartChallengeCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartChallengeCsReq(), input).checkInitialized();
    }

    public static StartChallengeCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartChallengeCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating StartChallengeCsReq messages
     */
    public static MessageFactory<StartChallengeCsReq> getFactory() {
      return StartChallengeCsReqFactory.INSTANCE;
    }

    private enum StartChallengeCsReqFactory implements MessageFactory<StartChallengeCsReq> {
      INSTANCE;

      @Override
      public StartChallengeCsReq create() {
        return StartChallengeCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName challengeId = FieldName.forField("challengeId", "challenge_id");

      static final FieldName extInfo = FieldName.forField("extInfo", "ext_info");

      static final FieldName lineup1 = FieldName.forField("lineup1");

      static final FieldName lineup2 = FieldName.forField("lineup2");
    }
  }
}
