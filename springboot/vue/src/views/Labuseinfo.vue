<template>
<div>
  <div style="margin: 10px 0">
    <el-input style="width: 200px" placeholder="请输入实验室编号" suffix-icon="el-icon-message" class="ml-5" v-model="labno"></el-input>
    <el-input style="width: 200px" placeholder="请输入值班人员编号" suffix-icon="el-icon-position" class="ml-5" v-model="dutyUsrNo"></el-input>
    <el-input style="width: 200px" placeholder="请输入使用人员编号" suffix-icon="el-icon-position" class="ml-5" v-model="useUsrNo"></el-input>
    <el-button class="ml-5" type="primary" @click="load">搜索</el-button>
    <el-button type="warning" @click="reset">重置</el-button>
  </div>

  <div style="margin: 10px 0">
    <el-button type="primary" @click="handleAdd">新增 <i class="el-icon-circle-plus-outline"></i></el-button>
    <el-popconfirm
        class="ml-5"
        confirm-button-text='确定'
        cancel-button-text='取消'
        icon="el-icon-info"
        icon-color="red"
        title="确定批量删除勾选的数据吗？"
        @confirm="delBatch"
    >
      <el-button type="danger" slot="reference">批量删除 <i class="el-icon-remove-outline"></i></el-button>
    </el-popconfirm>

  </div>

  <el-table :data="tableData" border stripe :header-cell-class-name="'headerBg'" @selection-change="handleSelectionChange">
    <el-table-column
        type="selection"
        width="55">
    </el-table-column>
    <el-table-column prop="id" label="主键" fit width="fit">          </el-table-column>
    <el-table-column prop="labno" label="实验室编号" width="100">          </el-table-column>
    <el-table-column prop="dutyUsrNo" label="值班人编号" >              </el-table-column>
    <el-table-column prop="useUsrNo" label="使用人编号" >              </el-table-column>
    <el-table-column prop="useDate" label="使用日期" >         </el-table-column>
    <el-table-column prop="remark" label="备注">         </el-table-column>
    <el-table-column label="操作"  width="200" align="center">
      <template slot-scope="scope">
        <el-button type="success" @click="handleEdit(scope.row)">编辑 <i class="el-icon-edit"></i></el-button>
        <el-popconfirm
            class="ml-5"
            confirm-button-text='确定'
            cancel-button-text='取消'
            icon="el-icon-info"
            icon-color="red"
            title="确定删除吗？"
            @confirm="del(scope.row.id)"
        >
          <el-button type="danger" slot="reference" >删除 <i class="el-icon-remove-outline"></i></el-button>
        </el-popconfirm>
      </template>
    </el-table-column>
  </el-table>
  <div style="padding: 10px 0">
    <el-pagination
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page="pageNum"
        :page-sizes="[5, 10, 15, 20]"
        :page-size="5"
        layout="total, sizes, prev, pager, next, jumper"
        :total="total">
    </el-pagination>
  </div>

  <el-dialog title="实验室使用信息" :visible.sync="dialogFormVisible" width="30%">
    <el-form label-width="80px" size="big">
      <el-form-item label="实验室编号">
        <el-input v-model="form.labno" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="值班人员编号">
        <el-input v-model.trim = "form.dutyUsrNo" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="使用人员编号">
        <el-input v-model.trim = "form.useUsrNo" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="备注信息">
        <el-input v-model="form.remark" autocomplete="off"></el-input>
      </el-form-item>

    </el-form>
    <div slot="footer" class="dialog-footer">
      <el-button @click="dialogFormVisible = false">取 消</el-button>
      <el-button type="primary" @click="save">确 定</el-button>
    </div>
  </el-dialog>
</div>
</template>

<script>
export default {
  name: "Labuseinfo",
  data(){
    return{

      value: '',
      tableData: [],
      total:0,
      pageNum:1,
      pageSize:5,
      labno:"",
      dutyUsrNo:"",
      useUsrNo:"",
      //添加信息表单
      dialogFormVisible:false,
      form:{},
      multipleSelection:[]
    }
  },
  created(){
    this.load()
  },
  methods:{

    load(){
      this.request.get("/labuseinfo/page", {
        params: {
          pageNum: this.pageNum,
          pageSize: this.pageSize,
          labno: this.labno,
          dutyusrno: this.dutyUsrNo,
          useusrno:this.useUsrNo
        }
      }).then(res => {
            console.log(res)
            this.tableData = res.records
            this.total= res.total
          })
    },
    save(){
      this.request.post("/labuseinfo",this.form).then(res=>{
        if(res) {
          this.$message.success("添加成功")
          this.dialogFormVisible=false
          this.load()
        } else{
          this.$message.error("添加失败")
        }
      })
    },
    //*添加数据
    handleAdd(){
      this.dialogFormVisible=true
      this.form={}
    },
    //*编辑数据
    handleEdit(row){
      this.form=row
      this.dialogFormVisible=true
    },
    //*删除数据
    del(id){
      this.request.delete("/labuseinfo/"+id).then(res=>{
        if(res){
          this.$message.success("删除成功")
          this.load()
        } else{
          this.$message.error("删除失败")
        }
      })
    },
    handleSelectionChange(val){
      console.log(val)
      this.multipleSelection=val
    },
    delBatch(){
      let ids=this.multipleSelection.map(v => v.id)//把对象数组编程纯数字数组[{} {} {}]->[1,2,3]
      this.request.post("/labuseinfo/del/batch",ids).then(res=>{
        if(res){
          this.$message.success("批量删除成功")
          this.load()
        } else{
          this.$message.error("批量删除失败")
        }
      })
    },
    reset(){
      this.username=""
      this.level=""
      this.name=""
      this.load()
    },
    handleSizeChange(pageSize) {
      console.log(pageSize)
      this.pageSize=pageSize
      this.load()
    },
    handleCurrentChange(pageNum) {
      console.log(pageNum)
      this.pageNum=pageNum
      this.load()
    },
    exp(){
      window.open("http://localhost:9090/user/export")
    },
    handleExcelImportSuccess(){
      this.$message.success("导入成功")
      this.load()
    }
  }
}
</script>

<style scoped>
.headerBg {
  background: #eee!important;
}
</style>