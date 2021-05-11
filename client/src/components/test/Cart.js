import React from 'react';
import {Link} from 'react-router-dom';

function Cart() {
    let sum = 12341234124;

	// 여기서 sum 값에 값들을 더하는 함수들이 있다.
    
    return (
        <div>
            <div className='cartStyle'>
                <div>금 액 : {sum}</div><br />
                <Link to= {{
                    pathname: '/finalcart',
                    state: {sum},
                }}>
                    <div><button>결제하기</button></div>
                </Link>
            </div>
        </div>
    );
}

export default Cart;