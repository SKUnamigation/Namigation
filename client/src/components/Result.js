import React from 'react'

const Result = () => {

    return (
        <div>
           {this.state.name}
        </div>
    )
}

Result.defaultProps = {
    name: '이름없음'
  }

export default Result

