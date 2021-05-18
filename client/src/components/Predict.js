import React, { Component, Fragment } from 'react'
import { post } from 'axios';
import { Route, Link } from 'react-router-dom';
import Table from './Table1'
import '../App.css';
import WelcomePage from './WelcomePage-motion';
import html2canvas from 'html2canvas';
import { withRouter } from 'react-router-dom';
import $ from 'jquery';
import Result from '../components/Result'

export default class Predict extends Component {
    static defaultProps = {
        isLogin: "",
        name: "",
    }
    constructor(props) {
        super(props);
        this.state = {
            test:"Test",
            userNum: this.props.userNum,
            high: "",
            middle: "",
            low: "",
            good: "",
            isLogin: null,
            isResult: null
        }
        this.handleValueChange = this.handleValueChange.bind(this)
        this.addpredict = this.addpredict.bind(this)
    }


    stateRefresh = () => {
        console.log("checkpoin4")
        this.setState(
            {
                predict: "",
                completed: 0
            }
        );

        this.callApi().then(res => this.setState({ predict: res })).catch(err => console.log(err))
    }

    handleFormPredict = (e) => {
        this.downImg()
        e.preventDefault()
        console.log("checkpoint2")

        this.addpredict()
            .then((response) => {
                console.log("!!!!!!!" + response.data);
            })

        alert("전송완료!")
    }



    downImg() {
        const filename = this.state.userNum;
        const date = new Date();
        console.log(`${date.getDate()+1}`)
        html2canvas($("#WebCam")[0]).then(function (canvas) {
            var myImage = canvas.toDataURL();
            var link = document.createElement("a")
            link.download = "촬영한 사진.png";
            link.href = myImage;
            document.body.appendChild(link);
            link.click();
        });

    }





    handleValueChange = (e) => {
        console.log("checkpoint1")
        let nextState = {};
        nextState[e.target.name] = e.target.value;
        this.setState(nextState)
    }

    addpredict = () => {
        const url = '/api/predict';
        const formData = new FormData();
        formData.append('userNum', this.props.userNum);
        formData.append('high', this.state.high * 100);
        formData.append('middle', this.state.middle * 100);
        formData.append('low', this.state.low * 100);
        formData.append('good', this.state.good * 100);
        const config = {
            headers: {
                'content-type': 'multipart/form-data'
            }
        }
        return post(url, formData, config);
    }


    //////시작 ////////
    addresult = () => {
        const url = '/api/result/:userNum';
        const formData = new FormData();
        formData.append('userNum', this.props.userNum);
        const config = {
            headers: {
                'content-type': 'multipart/form-data'
            }
        }
        return post(url, formData, config);
    }

    //////삭제///////

    GetTeachValue = (data1, data2, data3, data4) => {
        this.setState({
            high: data1,
            middle: data2,
            low: data3,
            good: data4,
        })
    }

    render() {
        return (
            <div className="PredictPage">
                {
                    this.props.isLogin ? (
                        <div className="Predict-form">
                            <h1>{this.props.isLogin}</h1>
                            {this.state.high === "" ? (<div id="outspinner">Loading...<hr/><hr/><div id="spinner"></div><hr/><hr/></div>) : (<div></div>)}
                            <div><WelcomePage GetTeachValue={this.GetTeachValue} /></div>
                            <hr/><hr/>
                            <form onSubmit={this.handleFormPredict}>
                                <input id="HighClass" type="text" name="high" value={"고위험 : " + this.state.high * 100} onChange={this.handleValueChange} placeholder="High" maxLength='2'></input>
                                <input type="text" id="MiddleClass" name="middle" value={"위   험 : " + this.state.middle * 100} onChange={this.handleValueChange} placeholder="Middle" maxLength='2'></input>
                                <br></br><input type="text" id="LowClass" name="low" value={"경   고 : " + this.state.low * 100} onChange={this.handleValueChange} placeholder="Low" maxLength='2'></input>
                                <input type="text" id="GoodClass" name="good" value={"좋   음 : " + this.state.good * 100} onChange={this.handleValueChange} placeholder="Good" maxLength='2'></input>
                                <input type="hidden" value={this.props.name} ></input>
                                <button id="submitButton" type="submit">Submit</button>
                            </form>
                            <Result high={this.state.high} middle={this.state.middle} low={this.state.low} good={this.state.good}></Result>
                        </div>) :(<div></div>)
                        // (<div><Result high={this.state.high} middle ={this.state.middle} low ={this.state.low} good={this.state.good}></Result>~</div>)
                }
            </div>
        )
    }
}
