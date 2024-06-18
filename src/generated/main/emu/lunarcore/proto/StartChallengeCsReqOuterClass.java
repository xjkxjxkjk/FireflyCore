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
   * <pre>
   *  Bfpafgpmfib
   * </pre>
   *
   * Protobuf type {@code StartChallengeCsReq}
   */
  public static final class StartChallengeCsReq extends ProtoMessage<StartChallengeCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 challenge_id = 15;</code>
     */
    private int challengeId;

    /**
     * <pre>
     *  leiglhbeaan
     * </pre>
     *
     * <code>optional .StartChallengeStoryInfo story_info = 3;</code>
     */
    private final StartChallengeStoryInfoOuterClass.StartChallengeStoryInfo storyInfo = StartChallengeStoryInfoOuterClass.StartChallengeStoryInfo.newInstance();

    /**
     * <pre>
     *  agkdhdbfocc
     * </pre>
     *
     * <code>repeated uint32 team_one = 7;</code>
     */
    private final RepeatedInt teamOne = RepeatedInt.newEmptyInstance();

    /**
     * <pre>
     *  agblmgmiebi
     * </pre>
     *
     * <code>repeated uint32 team_two = 14;</code>
     */
    private final RepeatedInt teamTwo = RepeatedInt.newEmptyInstance();

    private StartChallengeCsReq() {
    }

    /**
     * <pre>
     *  Bfpafgpmfib
     * </pre>
     *
     * @return a new empty instance of {@code StartChallengeCsReq}
     */
    public static StartChallengeCsReq newInstance() {
      return new StartChallengeCsReq();
    }

    /**
     * <code>optional uint32 challenge_id = 15;</code>
     * @return whether the challengeId field is set
     */
    public boolean hasChallengeId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 challenge_id = 15;</code>
     * @return this
     */
    public StartChallengeCsReq clearChallengeId() {
      bitField0_ &= ~0x00000001;
      challengeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 challenge_id = 15;</code>
     * @return the challengeId
     */
    public int getChallengeId() {
      return challengeId;
    }

    /**
     * <code>optional uint32 challenge_id = 15;</code>
     * @param value the challengeId to set
     * @return this
     */
    public StartChallengeCsReq setChallengeId(final int value) {
      bitField0_ |= 0x00000001;
      challengeId = value;
      return this;
    }

    /**
     * <pre>
     *  leiglhbeaan
     * </pre>
     *
     * <code>optional .StartChallengeStoryInfo story_info = 3;</code>
     * @return whether the storyInfo field is set
     */
    public boolean hasStoryInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  leiglhbeaan
     * </pre>
     *
     * <code>optional .StartChallengeStoryInfo story_info = 3;</code>
     * @return this
     */
    public StartChallengeCsReq clearStoryInfo() {
      bitField0_ &= ~0x00000002;
      storyInfo.clear();
      return this;
    }

    /**
     * <pre>
     *  leiglhbeaan
     * </pre>
     *
     * <code>optional .StartChallengeStoryInfo story_info = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableStoryInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public StartChallengeStoryInfoOuterClass.StartChallengeStoryInfo getStoryInfo() {
      return storyInfo;
    }

    /**
     * <pre>
     *  leiglhbeaan
     * </pre>
     *
     * <code>optional .StartChallengeStoryInfo story_info = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public StartChallengeStoryInfoOuterClass.StartChallengeStoryInfo getMutableStoryInfo() {
      bitField0_ |= 0x00000002;
      return storyInfo;
    }

    /**
     * <pre>
     *  leiglhbeaan
     * </pre>
     *
     * <code>optional .StartChallengeStoryInfo story_info = 3;</code>
     * @param value the storyInfo to set
     * @return this
     */
    public StartChallengeCsReq setStoryInfo(
        final StartChallengeStoryInfoOuterClass.StartChallengeStoryInfo value) {
      bitField0_ |= 0x00000002;
      storyInfo.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  agkdhdbfocc
     * </pre>
     *
     * <code>repeated uint32 team_one = 7;</code>
     * @return whether the teamOne field is set
     */
    public boolean hasTeamOne() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *  agkdhdbfocc
     * </pre>
     *
     * <code>repeated uint32 team_one = 7;</code>
     * @return this
     */
    public StartChallengeCsReq clearTeamOne() {
      bitField0_ &= ~0x00000004;
      teamOne.clear();
      return this;
    }

    /**
     * <pre>
     *  agkdhdbfocc
     * </pre>
     *
     * <code>repeated uint32 team_one = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTeamOne()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getTeamOne() {
      return teamOne;
    }

    /**
     * <pre>
     *  agkdhdbfocc
     * </pre>
     *
     * <code>repeated uint32 team_one = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableTeamOne() {
      bitField0_ |= 0x00000004;
      return teamOne;
    }

    /**
     * <pre>
     *  agkdhdbfocc
     * </pre>
     *
     * <code>repeated uint32 team_one = 7;</code>
     * @param value the teamOne to add
     * @return this
     */
    public StartChallengeCsReq addTeamOne(final int value) {
      bitField0_ |= 0x00000004;
      teamOne.add(value);
      return this;
    }

    /**
     * <pre>
     *  agkdhdbfocc
     * </pre>
     *
     * <code>repeated uint32 team_one = 7;</code>
     * @param values the teamOne to add
     * @return this
     */
    public StartChallengeCsReq addAllTeamOne(final int... values) {
      bitField0_ |= 0x00000004;
      teamOne.addAll(values);
      return this;
    }

    /**
     * <pre>
     *  agblmgmiebi
     * </pre>
     *
     * <code>repeated uint32 team_two = 14;</code>
     * @return whether the teamTwo field is set
     */
    public boolean hasTeamTwo() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     *  agblmgmiebi
     * </pre>
     *
     * <code>repeated uint32 team_two = 14;</code>
     * @return this
     */
    public StartChallengeCsReq clearTeamTwo() {
      bitField0_ &= ~0x00000008;
      teamTwo.clear();
      return this;
    }

    /**
     * <pre>
     *  agblmgmiebi
     * </pre>
     *
     * <code>repeated uint32 team_two = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTeamTwo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getTeamTwo() {
      return teamTwo;
    }

    /**
     * <pre>
     *  agblmgmiebi
     * </pre>
     *
     * <code>repeated uint32 team_two = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableTeamTwo() {
      bitField0_ |= 0x00000008;
      return teamTwo;
    }

    /**
     * <pre>
     *  agblmgmiebi
     * </pre>
     *
     * <code>repeated uint32 team_two = 14;</code>
     * @param value the teamTwo to add
     * @return this
     */
    public StartChallengeCsReq addTeamTwo(final int value) {
      bitField0_ |= 0x00000008;
      teamTwo.add(value);
      return this;
    }

    /**
     * <pre>
     *  agblmgmiebi
     * </pre>
     *
     * <code>repeated uint32 team_two = 14;</code>
     * @param values the teamTwo to add
     * @return this
     */
    public StartChallengeCsReq addAllTeamTwo(final int... values) {
      bitField0_ |= 0x00000008;
      teamTwo.addAll(values);
      return this;
    }

    @Override
    public StartChallengeCsReq copyFrom(final StartChallengeCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        challengeId = other.challengeId;
        storyInfo.copyFrom(other.storyInfo);
        teamOne.copyFrom(other.teamOne);
        teamTwo.copyFrom(other.teamTwo);
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
      if (other.hasStoryInfo()) {
        getMutableStoryInfo().mergeFrom(other.storyInfo);
      }
      if (other.hasTeamOne()) {
        getMutableTeamOne().addAll(other.teamOne);
      }
      if (other.hasTeamTwo()) {
        getMutableTeamTwo().addAll(other.teamTwo);
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
      storyInfo.clear();
      teamOne.clear();
      teamTwo.clear();
      return this;
    }

    @Override
    public StartChallengeCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      storyInfo.clearQuick();
      teamOne.clear();
      teamTwo.clear();
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
        && (!hasStoryInfo() || storyInfo.equals(other.storyInfo))
        && (!hasTeamOne() || teamOne.equals(other.teamOne))
        && (!hasTeamTwo() || teamTwo.equals(other.teamTwo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(challengeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 26);
        output.writeMessageNoTag(storyInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < teamOne.length(); i++) {
          output.writeRawByte((byte) 56);
          output.writeUInt32NoTag(teamOne.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < teamTwo.length(); i++) {
          output.writeRawByte((byte) 112);
          output.writeUInt32NoTag(teamTwo.array()[i]);
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
        size += 1 + ProtoSink.computeMessageSizeNoTag(storyInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * teamOne.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(teamOne);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * teamTwo.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(teamTwo);
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
          case 120: {
            // challengeId
            challengeId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // storyInfo
            input.readMessage(storyInfo);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // teamOne [packed=true]
            input.readPackedUInt32(teamOne, tag);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // teamTwo [packed=true]
            input.readPackedUInt32(teamTwo, tag);
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
          case 56: {
            // teamOne [packed=false]
            tag = input.readRepeatedUInt32(teamOne, tag);
            bitField0_ |= 0x00000004;
            break;
          }
          case 112: {
            // teamTwo [packed=false]
            tag = input.readRepeatedUInt32(teamTwo, tag);
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
        output.writeMessage(FieldNames.storyInfo, storyInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedUInt32(FieldNames.teamOne, teamOne);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedUInt32(FieldNames.teamTwo, teamTwo);
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
          case 1710116675:
          case 1494185400: {
            if (input.isAtField(FieldNames.storyInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(storyInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1439302967:
          case -1668241020: {
            if (input.isAtField(FieldNames.teamOne)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(teamOne);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1439297873:
          case -1668235926: {
            if (input.isAtField(FieldNames.teamTwo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(teamTwo);
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

      static final FieldName storyInfo = FieldName.forField("storyInfo", "story_info");

      static final FieldName teamOne = FieldName.forField("teamOne", "team_one");

      static final FieldName teamTwo = FieldName.forField("teamTwo", "team_two");
    }
  }
}