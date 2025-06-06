const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmmaas9/",
            name: "ssmmaas9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmmaas9/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "家庭财务管理系统小程序"
        } 
    }
}
export default base
