<template>
	<view class="content">
		<view class="logo" v-if="true">
			<image :style='{"boxShadow":"0 0 0px #59f43e","borderColor":"rgba(51, 204, 51, 1)","borderRadius":"40rpx","borderWidth":"2rpx","width":"160rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20201207/bd5eec4088ef4635b9f9a27f03bc6c8b.jpg","isShow":true,"height":"160rpx"}' src='http://codegen.caihongy.cn/20201207/bd5eec4088ef4635b9f9a27f03bc6c8b.jpg' mode="aspectFill"></image>
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.zhanghao" type="text" class="uni-input" name="" placeholder="账号" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xingming" type="text" class="uni-input" name="" placeholder="姓名" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
                        <picker @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
                                <view :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.nianling" type="text" class="uni-input" name="" placeholder="年龄" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.shouji" type="text" class="uni-input" name="" placeholder="手机" />
		</view>
		<view v-if="tableName=='yonghu'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.shenfenzheng" type="text" class="uni-input" name="" placeholder="身份证" />
		</view>
		<view>
			<button @tap="register" type="primary" :style='{"borderColor":"#ccc","backgroundColor":"rgba(51, 204, 51, 1)","borderRadius":"40rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"2rpx","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
                                yonghuxingbieOptions: [],
                                yonghuxingbieIndex: 0,
				ruleForm: {
				},
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                        	this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        yonghuxingbieChange(e) {
                                this.yonghuxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
                        },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.zhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.xingming) && `yonghu` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
					this.$utils.msg(`身份证应输入身份证格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 100upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 88rpx;
}

</style>
