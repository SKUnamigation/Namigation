import React from 'react';
import {useLocation} from 'react-router-dom';

function FinalCart() {
    // useLocation()을 사용하여 Link에서 넘겨준 state 값을 받아온다
    const sum = useLocation();
    
    return (
        <div>
            <h3>최종 장바구니 화면입니다.</h3>
            <div>총 금 액 : {sum.state.sum}</div>
            <br />
            <hr />
            <div><button>결제하기</button></div>
        </div>
    );
}

export default FinalCart;
