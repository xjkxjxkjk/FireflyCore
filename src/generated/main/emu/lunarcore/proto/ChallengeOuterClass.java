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

public final class ChallengeOuterClass {
  /**
   * <pre>
   *  OEKIEIHHJBC
   * </pre>
   *
   * Protobuf type {@code Challenge}
   */
  public static final class Challenge extends ProtoMessage<Challenge> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  MMFANDCAFHG
     * </pre>
     *
     * <code>optional uint32 score = 1;</code>
     */
    private int score;

    /**
     * <code>optional uint32 BPPEIKJFFKN = 4;</code>
     */
    private int bPPEIKJFFKN;

    /**
     * <code>optional uint32 challenge_id = 5;</code>
     */
    private int challengeId;

    /**
     * <code>optional uint32 score_two = 6;</code>
     */
    private int scoreTwo;

    /**
     * <pre>
     *  PJBAHEMCNHN
     * </pre>
     *
     * <code>optional uint32 taken_reward = 9;</code>
     */
    private int takenReward;

    /**
     * <code>optional uint32 stars = 14;</code>
     */
    private int stars;

    /**
     * <code>optional bool BIALOEHENPF = 13;</code>
     */
    private boolean bIALOEHENPF;

    /**
     * <code>optional .ChallengeBossExtraInfo start_info = 3;</code>
     */
    private final ChallengeBossExtraInfoOuterClass.ChallengeBossExtraInfo startInfo = ChallengeBossExtraInfoOuterClass.ChallengeBossExtraInfo.newInstance();

    private Challenge() {
    }

    /**
     * <pre>
     *  OEKIEIHHJBC
     * </pre>
     *
     * @return a new empty instance of {@code Challenge}
     */
    public static Challenge newInstance() {
      return new Challenge();
    }

    /**
     * <pre>
     *  MMFANDCAFHG
     * </pre>
     *
     * <code>optional uint32 score = 1;</code>
     * @return whether the score field is set
     */
    public boolean hasScore() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  MMFANDCAFHG
     * </pre>
     *
     * <code>optional uint32 score = 1;</code>
     * @return this
     */
    public Challenge clearScore() {
      bitField0_ &= ~0x00000001;
      score = 0;
      return this;
    }

    /**
     * <pre>
     *  MMFANDCAFHG
     * </pre>
     *
     * <code>optional uint32 score = 1;</code>
     * @return the score
     */
    public int getScore() {
      return score;
    }

    /**
     * <pre>
     *  MMFANDCAFHG
     * </pre>
     *
     * <code>optional uint32 score = 1;</code>
     * @param value the score to set
     * @return this
     */
    public Challenge setScore(final int value) {
      bitField0_ |= 0x00000001;
      score = value;
      return this;
    }

    /**
     * <code>optional uint32 BPPEIKJFFKN = 4;</code>
     * @return whether the bPPEIKJFFKN field is set
     */
    public boolean hasBPPEIKJFFKN() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 BPPEIKJFFKN = 4;</code>
     * @return this
     */
    public Challenge clearBPPEIKJFFKN() {
      bitField0_ &= ~0x00000002;
      bPPEIKJFFKN = 0;
      return this;
    }

    /**
     * <code>optional uint32 BPPEIKJFFKN = 4;</code>
     * @return the bPPEIKJFFKN
     */
    public int getBPPEIKJFFKN() {
      return bPPEIKJFFKN;
    }

    /**
     * <code>optional uint32 BPPEIKJFFKN = 4;</code>
     * @param value the bPPEIKJFFKN to set
     * @return this
     */
    public Challenge setBPPEIKJFFKN(final int value) {
      bitField0_ |= 0x00000002;
      bPPEIKJFFKN = value;
      return this;
    }

    /**
     * <code>optional uint32 challenge_id = 5;</code>
     * @return whether the challengeId field is set
     */
    public boolean hasChallengeId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 challenge_id = 5;</code>
     * @return this
     */
    public Challenge clearChallengeId() {
      bitField0_ &= ~0x00000004;
      challengeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 challenge_id = 5;</code>
     * @return the challengeId
     */
    public int getChallengeId() {
      return challengeId;
    }

    /**
     * <code>optional uint32 challenge_id = 5;</code>
     * @param value the challengeId to set
     * @return this
     */
    public Challenge setChallengeId(final int value) {
      bitField0_ |= 0x00000004;
      challengeId = value;
      return this;
    }

    /**
     * <code>optional uint32 score_two = 6;</code>
     * @return whether the scoreTwo field is set
     */
    public boolean hasScoreTwo() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 score_two = 6;</code>
     * @return this
     */
    public Challenge clearScoreTwo() {
      bitField0_ &= ~0x00000008;
      scoreTwo = 0;
      return this;
    }

    /**
     * <code>optional uint32 score_two = 6;</code>
     * @return the scoreTwo
     */
    public int getScoreTwo() {
      return scoreTwo;
    }

    /**
     * <code>optional uint32 score_two = 6;</code>
     * @param value the scoreTwo to set
     * @return this
     */
    public Challenge setScoreTwo(final int value) {
      bitField0_ |= 0x00000008;
      scoreTwo = value;
      return this;
    }

    /**
     * <pre>
     *  PJBAHEMCNHN
     * </pre>
     *
     * <code>optional uint32 taken_reward = 9;</code>
     * @return whether the takenReward field is set
     */
    public boolean hasTakenReward() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     *  PJBAHEMCNHN
     * </pre>
     *
     * <code>optional uint32 taken_reward = 9;</code>
     * @return this
     */
    public Challenge clearTakenReward() {
      bitField0_ &= ~0x00000010;
      takenReward = 0;
      return this;
    }

    /**
     * <pre>
     *  PJBAHEMCNHN
     * </pre>
     *
     * <code>optional uint32 taken_reward = 9;</code>
     * @return the takenReward
     */
    public int getTakenReward() {
      return takenReward;
    }

    /**
     * <pre>
     *  PJBAHEMCNHN
     * </pre>
     *
     * <code>optional uint32 taken_reward = 9;</code>
     * @param value the takenReward to set
     * @return this
     */
    public Challenge setTakenReward(final int value) {
      bitField0_ |= 0x00000010;
      takenReward = value;
      return this;
    }

    /**
     * <code>optional uint32 stars = 14;</code>
     * @return whether the stars field is set
     */
    public boolean hasStars() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 stars = 14;</code>
     * @return this
     */
    public Challenge clearStars() {
      bitField0_ &= ~0x00000020;
      stars = 0;
      return this;
    }

    /**
     * <code>optional uint32 stars = 14;</code>
     * @return the stars
     */
    public int getStars() {
      return stars;
    }

    /**
     * <code>optional uint32 stars = 14;</code>
     * @param value the stars to set
     * @return this
     */
    public Challenge setStars(final int value) {
      bitField0_ |= 0x00000020;
      stars = value;
      return this;
    }

    /**
     * <code>optional bool BIALOEHENPF = 13;</code>
     * @return whether the bIALOEHENPF field is set
     */
    public boolean hasBIALOEHENPF() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional bool BIALOEHENPF = 13;</code>
     * @return this
     */
    public Challenge clearBIALOEHENPF() {
      bitField0_ &= ~0x00000040;
      bIALOEHENPF = false;
      return this;
    }

    /**
     * <code>optional bool BIALOEHENPF = 13;</code>
     * @return the bIALOEHENPF
     */
    public boolean getBIALOEHENPF() {
      return bIALOEHENPF;
    }

    /**
     * <code>optional bool BIALOEHENPF = 13;</code>
     * @param value the bIALOEHENPF to set
     * @return this
     */
    public Challenge setBIALOEHENPF(final boolean value) {
      bitField0_ |= 0x00000040;
      bIALOEHENPF = value;
      return this;
    }

    /**
     * <code>optional .ChallengeBossExtraInfo start_info = 3;</code>
     * @return whether the startInfo field is set
     */
    public boolean hasStartInfo() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional .ChallengeBossExtraInfo start_info = 3;</code>
     * @return this
     */
    public Challenge clearStartInfo() {
      bitField0_ &= ~0x00000080;
      startInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChallengeBossExtraInfo start_info = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableStartInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChallengeBossExtraInfoOuterClass.ChallengeBossExtraInfo getStartInfo() {
      return startInfo;
    }

    /**
     * <code>optional .ChallengeBossExtraInfo start_info = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChallengeBossExtraInfoOuterClass.ChallengeBossExtraInfo getMutableStartInfo() {
      bitField0_ |= 0x00000080;
      return startInfo;
    }

    /**
     * <code>optional .ChallengeBossExtraInfo start_info = 3;</code>
     * @param value the startInfo to set
     * @return this
     */
    public Challenge setStartInfo(
        final ChallengeBossExtraInfoOuterClass.ChallengeBossExtraInfo value) {
      bitField0_ |= 0x00000080;
      startInfo.copyFrom(value);
      return this;
    }

    @Override
    public Challenge copyFrom(final Challenge other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        score = other.score;
        bPPEIKJFFKN = other.bPPEIKJFFKN;
        challengeId = other.challengeId;
        scoreTwo = other.scoreTwo;
        takenReward = other.takenReward;
        stars = other.stars;
        bIALOEHENPF = other.bIALOEHENPF;
        startInfo.copyFrom(other.startInfo);
      }
      return this;
    }

    @Override
    public Challenge mergeFrom(final Challenge other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasScore()) {
        setScore(other.score);
      }
      if (other.hasBPPEIKJFFKN()) {
        setBPPEIKJFFKN(other.bPPEIKJFFKN);
      }
      if (other.hasChallengeId()) {
        setChallengeId(other.challengeId);
      }
      if (other.hasScoreTwo()) {
        setScoreTwo(other.scoreTwo);
      }
      if (other.hasTakenReward()) {
        setTakenReward(other.takenReward);
      }
      if (other.hasStars()) {
        setStars(other.stars);
      }
      if (other.hasBIALOEHENPF()) {
        setBIALOEHENPF(other.bIALOEHENPF);
      }
      if (other.hasStartInfo()) {
        getMutableStartInfo().mergeFrom(other.startInfo);
      }
      return this;
    }

    @Override
    public Challenge clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      score = 0;
      bPPEIKJFFKN = 0;
      challengeId = 0;
      scoreTwo = 0;
      takenReward = 0;
      stars = 0;
      bIALOEHENPF = false;
      startInfo.clear();
      return this;
    }

    @Override
    public Challenge clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      startInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof Challenge)) {
        return false;
      }
      Challenge other = (Challenge) o;
      return bitField0_ == other.bitField0_
        && (!hasScore() || score == other.score)
        && (!hasBPPEIKJFFKN() || bPPEIKJFFKN == other.bPPEIKJFFKN)
        && (!hasChallengeId() || challengeId == other.challengeId)
        && (!hasScoreTwo() || scoreTwo == other.scoreTwo)
        && (!hasTakenReward() || takenReward == other.takenReward)
        && (!hasStars() || stars == other.stars)
        && (!hasBIALOEHENPF() || bIALOEHENPF == other.bIALOEHENPF)
        && (!hasStartInfo() || startInfo.equals(other.startInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(score);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(bPPEIKJFFKN);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(challengeId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(scoreTwo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(takenReward);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(stars);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 104);
        output.writeBoolNoTag(bIALOEHENPF);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 26);
        output.writeMessageNoTag(startInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(score);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(bPPEIKJFFKN);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(challengeId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(scoreTwo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(takenReward);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(stars);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(startInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Challenge mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // score
            score = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // bPPEIKJFFKN
            bPPEIKJFFKN = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // challengeId
            challengeId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // scoreTwo
            scoreTwo = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // takenReward
            takenReward = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // stars
            stars = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // bIALOEHENPF
            bIALOEHENPF = input.readBool();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // startInfo
            input.readMessage(startInfo);
            bitField0_ |= 0x00000080;
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
        output.writeUInt32(FieldNames.score, score);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.bPPEIKJFFKN, bPPEIKJFFKN);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.challengeId, challengeId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.scoreTwo, scoreTwo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.takenReward, takenReward);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.stars, stars);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeBool(FieldNames.bIALOEHENPF, bIALOEHENPF);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeMessage(FieldNames.startInfo, startInfo);
      }
      output.endObject();
    }

    @Override
    public Challenge mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 109264530: {
            if (input.isAtField(FieldNames.score)) {
              if (!input.trySkipNullValue()) {
                score = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1462550168: {
            if (input.isAtField(FieldNames.bPPEIKJFFKN)) {
              if (!input.trySkipNullValue()) {
                bPPEIKJFFKN = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -689112866:
          case 112359031: {
            if (input.isAtField(FieldNames.challengeId)) {
              if (!input.trySkipNullValue()) {
                challengeId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -485512614:
          case 2129303327: {
            if (input.isAtField(FieldNames.scoreTwo)) {
              if (!input.trySkipNullValue()) {
                scoreTwo = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1216849622:
          case -1923526233: {
            if (input.isAtField(FieldNames.takenReward)) {
              if (!input.trySkipNullValue()) {
                takenReward = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109757537: {
            if (input.isAtField(FieldNames.stars)) {
              if (!input.trySkipNullValue()) {
                stars = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1426238879: {
            if (input.isAtField(FieldNames.bIALOEHENPF)) {
              if (!input.trySkipNullValue()) {
                bIALOEHENPF = input.readBool();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2129617872:
          case -1573468565: {
            if (input.isAtField(FieldNames.startInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(startInfo);
                bitField0_ |= 0x00000080;
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
    public Challenge clone() {
      return new Challenge().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Challenge parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Challenge(), data).checkInitialized();
    }

    public static Challenge parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Challenge(), input).checkInitialized();
    }

    public static Challenge parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Challenge(), input).checkInitialized();
    }

    /**
     * @return factory for creating Challenge messages
     */
    public static MessageFactory<Challenge> getFactory() {
      return ChallengeFactory.INSTANCE;
    }

    private enum ChallengeFactory implements MessageFactory<Challenge> {
      INSTANCE;

      @Override
      public Challenge create() {
        return Challenge.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName score = FieldName.forField("score");

      static final FieldName bPPEIKJFFKN = FieldName.forField("BPPEIKJFFKN");

      static final FieldName challengeId = FieldName.forField("challengeId", "challenge_id");

      static final FieldName scoreTwo = FieldName.forField("scoreTwo", "score_two");

      static final FieldName takenReward = FieldName.forField("takenReward", "taken_reward");

      static final FieldName stars = FieldName.forField("stars");

      static final FieldName bIALOEHENPF = FieldName.forField("BIALOEHENPF");

      static final FieldName startInfo = FieldName.forField("startInfo", "start_info");
    }
  }
}
